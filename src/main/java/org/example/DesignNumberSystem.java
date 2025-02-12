package org.example;

import java.util.*;

class NumberContainers {
    HashMap<Integer, TreeSet<Integer>> hashMap;
    HashMap<Integer, Integer> indexNum;

    public NumberContainers() {
        hashMap = new HashMap<>();
        indexNum = new HashMap<>();
    }

    public void change(int index, int number) {

        if (indexNum.get(index) != null) {
            int previousNumber = indexNum.get(index);
            TreeSet treeSet1 = hashMap.get(previousNumber);
            treeSet1.remove(index);

            if(treeSet1.size()==0)
                hashMap.remove(previousNumber);

        }
        TreeSet treeSet = hashMap.getOrDefault(number, new TreeSet<>());
        treeSet.add(index);
        hashMap.put(number, treeSet);
        indexNum.put(index, number);


    }

    public int find(int number) {
        if (hashMap.get(number)==null)
            return -1;

        TreeSet<Integer> no = hashMap.get(number);
        return no.first();
    }
}

public class DesignNumberSystem {

    public static void main(String args[]) {
        NumberContainers numberContainers = new NumberContainers();
        numberContainers.change(1, 10);
        System.out.println(numberContainers.find(10));
        numberContainers.change(1, 20);
        System.out.println(numberContainers.find(10));
        System.out.println(numberContainers.find(20));
        System.out.println(numberContainers.find(30));

    }
}
