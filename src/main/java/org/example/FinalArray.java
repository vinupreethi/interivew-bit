package org.example;

import java.util.PriorityQueue;

class PairOfFinal
{
    int first;
    int second;
    PairOfFinal(int first,int second)
    {
        this.first=first;
        this.second=second;
    }
}
public class FinalArray {
    public static void main(String args[])
    {
        int nums[]={2,1,3,5,6};
        int k=5;
        int multiplier=2;

        PriorityQueue<PairOfFinal> priorityQueue=new PriorityQueue<>((a, b) -> {
            if(a.first==b.first)
                return a.second-b.second;
            return a.first-b.first;
        });
        for(int i=0;i<nums.length;i++) {
            PairOfFinal pairOfFinal=new PairOfFinal(nums[i],i);
            priorityQueue.add(pairOfFinal);
        }

        while(k!=0)
        {
            PairOfFinal answer=priorityQueue.poll();
            int first=answer.first  * multiplier;
            int second=answer.second;
            PairOfFinal pairOfFinal=new PairOfFinal(first,second);
            priorityQueue.offer(pairOfFinal);
            k--;
        }
        int answer[]=new int[nums.length];
        while(!priorityQueue.isEmpty())
        {
            PairOfFinal ans=priorityQueue.poll();
            answer[ans.second]=ans.first;
        }

        for(int k1=0;k1<nums.length;k1++)
            System.out.println(answer[k1]);
    }
}
