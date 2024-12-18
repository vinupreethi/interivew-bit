package org.example;

import java.util.HashMap;

class MRUNode {
    int key;
    int value;
    MRUNode next;
    MRUNode prev;

    MRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class MRUCache {
    int capacity;
    HashMap<Integer, MRUNode> hashMap = new HashMap<>();
    MRUNode tail;
    MRUNode head;

    MRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new MRUNode(0, 0);
        this.tail = new MRUNode(0, 0);
        head.prev=tail;
        tail.prev=head;
    }

    public static void main(String args[]) {
        MRUCache cache = new MRUCache(5);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        cache.put(5, 5);
        cache.put(6, 6);

        cache.get(2);
        cache.put(7, 7);
    }

    private int get(int key) {
        MRUNode node=hashMap.get(key);
        removeNode(hashMap.get(key));
        insertAtFirst(node);
        return node.value;

    }

    private void put(int key, int value) {
        MRUNode mruNode=new MRUNode(key,value);
        if(hashMap.containsKey(key))
        {
            removeNode(hashMap.get(key));
        }
        if(hashMap.size()==capacity)
        {
            removeFirstNode();
        }
        insertAtFirst(mruNode);
        hashMap.put(key,mruNode);


    }

    private void insertAtFirst(MRUNode node) {
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.prev = head;

    }

    private void removeFirstNode() {
        removeNode(head.next);
    }

    private void removeNode(MRUNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }
}
