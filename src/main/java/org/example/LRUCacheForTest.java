package org.example;

import java.util.HashMap;



public class LRUCacheForTest {
    HashMap<Integer,Nodell> hashMap=new HashMap<Integer, Nodell>();


    public LRUCacheForTest(int capacity) {
    }

    private void get(int key) {
    }

    private void put(int key, int value) {

    }



    public static void main(String args[]) {
        LRUCacheForTest lRUCache = new LRUCacheForTest(2);
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
