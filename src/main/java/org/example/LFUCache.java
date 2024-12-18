package org.example;

import java.util.HashMap;

class Node1 {
    int key;
    int value;
    Node1 prev;
    Node1 next;
    int freq=1;

    Node1(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class DoublyLinkedList {
    Node1 head;
    Node1 tail;

    DoublyLinkedList() {
        head = new Node1(-1, -1);
        tail = new Node1(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    void addNode(Node1 newnode) {
        head.next.prev = newnode;
        newnode.next = head.next;
        newnode.prev = head;
        head.next = newnode;


    }

    void remove(Node1 node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }

    Node1 removelastNode() {
        Node1 node = tail.prev;
        node.prev.next = tail;
        tail.prev = node.prev;
        return node;
    }

    boolean isEmpty() {
        if (head.next == tail)
            return true;
        return false;
    }

}

public class LFUCache {
    HashMap<Integer, Node1> hashMap = new HashMap<>();
    HashMap<Integer, DoublyLinkedList> frequencymap = new HashMap<>();
    int capacity;
    int minfreq;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minfreq=1;
    }

    public int get(int key) {
        if (hashMap.get(key) == null)
            return -1;
        Node1 node = hashMap.get(key);
        frequencymap.get(node.freq).remove(node);
        if(frequencymap.get(node.freq).isEmpty()){
            if(minfreq==node.freq){
                minfreq=node.freq+1;
            }
        }

        node.freq+=1;
        if (frequencymap.get(node.freq) == null) {
            DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
            doublyLinkedList1.addNode(node);
            frequencymap.put(node.freq, doublyLinkedList1);
        } else {
            DoublyLinkedList doublyLinkedList1 = frequencymap.get(node.freq);
            doublyLinkedList1.addNode(node);
            frequencymap.put(node.freq, doublyLinkedList1);
        }
        return hashMap.get(key).value;


    }

    public void put(int key, int value) {
        if (capacity == 0)
            return;
        if (hashMap.get(key) != null)
            {
                DoublyLinkedList doublyLinkedList = frequencymap.get(hashMap.get(key).freq);
                Node1 node = hashMap.get(key);
                //node.value = value;
                doublyLinkedList.remove(node);
                if (frequencymap.get(node.freq).isEmpty()) {
                    if (minfreq == node.freq) {
                        minfreq = node.freq + 1;
                    }
                }
                node.freq += 1;
                if (frequencymap.get(node.freq) == null) {
                    DoublyLinkedList doublyLinkedList1 = new DoublyLinkedList();
                    doublyLinkedList1.addNode(node);
                    frequencymap.put(node.freq, doublyLinkedList1);
                } else {
                   frequencymap.get(node.freq).addNode(node);
                   // frequencymap.put(node.freq, doublyLinkedList1);
                }
                node.value=value;

            }
            else
            {
                if (frequencymap.size() == capacity) {
                    Node1 node = frequencymap.get(minfreq).removelastNode();
                    hashMap.remove(node.key);

                }
                Node1 node = new Node1(key, value);
                hashMap.put(key, node);
                if (frequencymap.get(1) == null) {
                    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
                    doublyLinkedList.addNode(node);
                    frequencymap.put(1, doublyLinkedList);
                } else {
                     frequencymap.get(1).addNode(node);
                }
                minfreq = 1;

            }


        }


    public static void main(String args[]) {
        LFUCache lfu = new LFUCache(3);
        lfu.put(2, 2);   // cache=[1,_], cnt(1)=1
        lfu.put(1, 1);   // cache=[2,1], cnt(2)=1, cnt(1)=1
        System.out.println(lfu.get(2));
        System.out.println(lfu.get(1));
        System.out.println(lfu.get(2));   // return 1
        // cache=[1,2], cnt(2)=1, cnt(1)=2
        lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
        lfu.put(4, 4);
        // cache=[3,1], cnt(3)=1, cnt(1)=2
//        System.out.println(lfu.get(2));      // return -1 (not found)
//        System.out.println(lfu.get(3));      // return 3
        // cache=[3,1], cnt(3)=2, cnt(1)=2
       // lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
        // cache=[4,3], cnt(4)=1, cnt(3)=2
        System.out.println(lfu.get(3));      // return -1 (not found)
        System.out.println(lfu.get(2));      // return 3
        // cache=[3,4], cnt(4)=1, cnt(3)=3
        System.out.println(lfu.get(1));      // return 4
        // cache=[4,3], cnt(4)=2, cnt(3)=3
        System.out.println(lfu.get(4));
    }
}


