package org.example;

import java.util.HashMap;

class LinkedNode {
    int key;
    int value;
    LinkedNode prev;
    LinkedNode next;

    public LinkedNode(int key, int value) {
        this.key = key;
        this.value = value;

    }
}

public class LRU {
    public static void main(String args[]) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }
}

class LRUCache {

    LinkedNode head = new LinkedNode(0, 0);
    LinkedNode tail = new LinkedNode(0, 0);
    HashMap<Integer, LinkedNode> hashMap = new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        if (hashMap.get(key) != null) {
            LinkedNode node = hashMap.get(key);
            removeNode(node);
            insertNode(node);
            return node.value;
        } else
            return -1;


    }

    private void insertNode(LinkedNode node) {
        hashMap.put(node.key,node);
        head.next.prev = node;
        node.next = head.next;

        node.prev = head;
        head.next = node;

    }

    private void removeNode(LinkedNode node) {
        hashMap.remove(node.key,node);
        node.prev.next = node.next;
        node.next.prev = node.prev;


    }

    public void put(int key, int value) {
        if (hashMap.containsKey(key)) {
            removeNode(hashMap.get(key));
        }
        if (hashMap.size() == capacity) {
            removeNode(tail.prev);
        }
        insertNode(new LinkedNode(key, value));

    }


}