package org.example;

import java.util.*;

class MFUCache {
    // Cache item structure holding the value and its access frequency
    private static class CacheItem {
        int value;
        int frequency;

        public CacheItem(int value) {
            this.value = value;
            this.frequency = 0;  // Initial frequency is 0
        }
    }

    private final int capacity; // Maximum capacity of the cache
    private final Map<Integer, CacheItem> cache; // Cache to store the actual items (key -> value)
    private final Map<Integer, LinkedHashSet<Integer>> frequencyMap; // Frequency Map (frequency -> list of keys)
    private int maxFrequency; // Track the highest frequency in the cache

    // Constructor to initialize cache with given capacity
    public MFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();
        this.maxFrequency = 0;
    }

    // Helper function to update the frequency of an item
    private void updateFrequency(int key) {
        CacheItem item = cache.get(key);
        int oldFrequency = item.frequency;
        int newFrequency = oldFrequency + 1;

        // Remove the item from the old frequency list
        frequencyMap.get(oldFrequency).remove(key);
        if (frequencyMap.get(oldFrequency).isEmpty()) {
            frequencyMap.remove(oldFrequency);
        }

        // Add the item to the new frequency list
        frequencyMap.putIfAbsent(newFrequency, new LinkedHashSet<>());
        frequencyMap.get(newFrequency).add(key);

        // Update the item's frequency
        item.frequency = newFrequency;

        // Update the maximum frequency if necessary
        if (newFrequency > maxFrequency) {
            maxFrequency = newFrequency;
        }
    }

    // Get an item from the cache
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1; // Cache miss
        }

        // Update the frequency of the item
        updateFrequency(key);

        return cache.get(key).value; // Return the value of the item
    }

    // Put an item into the cache
    public void put(int key, int value) {
        // If the cache is at capacity, evict the MFU item
        if (cache.size() == capacity) {
            evict();
        }

        if (cache.containsKey(key)) {
            // Update the value and frequency of the existing item
            cache.get(key).value = value;
            updateFrequency(key);
        } else {
            // Add a new item to the cache
            CacheItem newItem = new CacheItem(value);
            cache.put(key, newItem);

            // Add the new item to the frequencyMap with frequency 1
            frequencyMap.putIfAbsent(1, new LinkedHashSet<>());
            frequencyMap.get(1).add(key);

            // Update the maximum frequency
            maxFrequency = Math.max(maxFrequency, 1);
        }
    }

    // Evict the Most Frequently Used (MFU) item from the cache
    private void evict() {
        if (maxFrequency == 0) {
            return; // No items to evict
        }

        // Get the list of keys that have the maximum frequency
        LinkedHashSet<Integer> mfuKeys = frequencyMap.get(maxFrequency);

        // Evict the first key from the list (FIFO eviction in case of tie in frequency)
        Iterator<Integer> iterator = mfuKeys.iterator();
        if (iterator.hasNext()) {
            int keyToEvict = iterator.next();
            mfuKeys.remove(keyToEvict);
            cache.remove(keyToEvict); // Remove the item from the cache

            // If the list becomes empty, remove the frequency entry
            if (mfuKeys.isEmpty()) {
                frequencyMap.remove(maxFrequency);
            }
        }
    }

    // Optional: Helper method to display the contents of the cache (for debugging)
    public void printCache() {
        System.out.println("Cache Contents: ");
        for (Map.Entry<Integer, CacheItem> entry : cache.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().value + ", Frequency: " + entry.getValue().frequency);
        }
    }
}

public class MFU {
    public static void main(String[] args) {
        // Example usage of the MFUCache
        MFUCache mfuCache = new MFUCache(3); // Create cache with capacity 3

        mfuCache.put(1, 100);
        mfuCache.put(2, 200);
        mfuCache.put(3, 300);
        mfuCache.printCache(); // Print current cache

        // Access some items
       // System.out.println("Get key 1: " + mfuCache.get(1)); // Should print 100
        mfuCache.put(4, 400); // This should evict the MFU item (key 1)
        mfuCache.printCache(); // Print current cache after eviction

        System.out.println("Get key 2: " + mfuCache.get(2)); // Should print 200
        mfuCache.put(5, 500); // This should evict the next MFU item (key 2)
        mfuCache.printCache(); // Print current cache after eviction
    }
}
