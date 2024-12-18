package org.example;

import java.util.HashMap;

class LL {
    int key;
    int value;
    LL next;
    LL prev;

    LL(int key, int value) {
        this.key = key;
        this.value = value;
    }


}

public class CacheLRU {
    int capacity;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    HashMap<Integer, LL> linkedlistHashMap = new HashMap<Integer, LL>();
    LL head;
    LL tail;

    CacheLRU(int capacity) {
        this.capacity = capacity;
        head = new LL(0, 0);
        tail = new LL(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public static void main(String args[]) {
        CacheLRU lRUCache = new CacheLRU(2);
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

    private int get(int key) {
        if (hashMap.get(key) != null) {
            LL node1 = linkedlistHashMap.get(key);
            removeNode(node1);
            insertNodeatFirst(node1);
            return node1.value;
        }
         else
            return -1;
    }

    private void put(int key, int value) {
        if (hashMap.size() == capacity) {
            LL node = removeTailNode();
            hashMap.remove(node.key);

        }
        LL node = new LL(key, value);
        hashMap.put(key, value);
        insertNodeatFirst(node);
        linkedlistHashMap.put(key, node);
    }

    private LL removeTailNode() {
        LL savenode = tail.prev;
        removeNode(tail.prev);
        return savenode;
    }

    private void removeNode(LL node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }

    private void insertNodeatFirst(LL node) {

        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.prev = head;

    }


}
