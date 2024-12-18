package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeOverlappingIntervals {
    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {


        int first=intervals.get(0).start;
        int second=intervals.get(0).end;
        ArrayList<Interval> result=new ArrayList<>();
        Collections.sort(intervals,(a, b)->
        {
            return b.start-a.start;
        });
        for(int i=1;i<intervals.size();i++)
        {
            if(intervals.get(i).end < intervals.get(i).end)
            {
                second=intervals.get(i).end;
            }
            else
            {
                Interval interval=new Interval(first,second);
                result.add(interval);
                if(i+1<=intervals.size()-1)
                {
                    first=intervals.get(0).start;
                    second=intervals.get(0).end;

                }
            }



        }
        System.out.println("result = " + result);
        return result;



    }

    public static void main(String args[])
    {
        Interval interval1=new Interval(1,3);
        Interval interval2=new Interval(2,6);
        Interval interval3=new Interval(8,10);
        Interval interval4=new Interval(15,18);
        ArrayList<Interval> intervals=new ArrayList<>();

        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);

        merge(intervals);

    }
}
