package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGifts {
    public static void main(String args[])
    {
        int gifts[]={25,64,9,4,100}; // 10 , 8,5, 3
        int k=4;
        int ans=0;
        PriorityQueue<Integer> queue = new PriorityQueue<>( Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++)
            queue.add(gifts[i]);

        while(!queue.isEmpty() && k!=0)
        {
            int answer= queue.poll();
            queue.offer((int) Math.floor(Math.sqrt(answer)));
            k--;
        }
        while(!queue.isEmpty())
        {
            ans+=queue.poll();
        }
        System.out.println(ans);

    }
}
