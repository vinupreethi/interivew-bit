package org.example;

import java.util.*;

public class AntiDiagonals {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> A= new ArrayList<>();
        ArrayList<Integer> row1=new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);

        ArrayList<Integer> row2=new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        ArrayList<Integer> row3=new ArrayList<>();
        row3.add(7);
        row3.add(8);
        row3.add(9);

        A.add(row1);
        A.add(row2);
        A.add(row3);

        System.out.println("A.size() = " + A.size());
        HashMap<Integer, ArrayList<Integer>> HashMap=new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            for(int j=0;j<A.size();j++)
            {
                int sum=i+j;
                if(HashMap.get(sum)!=null)
                {
                    ArrayList<Integer> arr=HashMap.get(sum);
                    arr.add(A.get(i).get(j));
                    HashMap.put(sum,arr);
                }
                else
                {
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.add(A.get(i).get(j));
                    HashMap.put(sum,arr);

                }

            }

        }
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
      for(Map.Entry<Integer,ArrayList<Integer>> iteration: HashMap.entrySet())
        {
            arr.add(iteration.getValue());
        }

    }
}
