package org.example;

import java.util.HashMap;

public class PermutationString {

    public static void main(String args[]) {
        String s1="hello";
        String s2="ooolleoooleh";
        HashMap<Character,Integer> have=new HashMap<>();
        HashMap<Character,Integer> need=new HashMap<>();

        int first_string_length=s1.length();
        int second_string_length=s2.length();



        for(int i=0;i<first_string_length;i++)
        {
            if(need.containsKey(s1.charAt(i)))
            {
                int value=need.get(s1.charAt(i));
                value=value+1;
                need.put(s1.charAt(i),value);
            }
            else
                need.put(s1.charAt(i),1);
        }

        System.out.println(need);




        int start=0;
        int end=0;
        while(end<second_string_length)
        {
            if(!need.containsKey(s2.charAt(end)))
            {
                end++;
                start=end;
                have.clear();
                continue;
            }



            if(have.containsKey(s2.charAt(end)))
            {
                int value=have.get(s2.charAt(end));
                value=value+1;
                have.put(s2.charAt(end),value);
            }
            else
            {
                have.put(s2.charAt(end),1);
            }


            if(need.containsKey(s2.charAt(end)) && have.containsKey(s2.charAt(end)) && need.get(s2.charAt(end))>have.get(s2.charAt(end)))
            {
                int value=have.get(s2.charAt(start));
                value=value-1;
                have.put(s2.charAt(start),value);
                start++;

            }

            if(end-start+1==s1.length())
                System.out.println("done = ");

            end++;


        }




    }
}
