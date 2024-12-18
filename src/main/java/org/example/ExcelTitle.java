package org.example;

import java.util.HashMap;

public class ExcelTitle {
    public static void main(String args[])
    {
        HashMap<Integer,Character> dict=new HashMap<>();
        int j=0;
        for(char c='A';c<='Z';c++)
        {
            dict.put(j,c);
            j++;
        }
        int ans=943566;
        String answer="";

        int temp=ans;
        int cnt=0;
        while(temp!=0)
        {
            temp=temp/26;
            cnt++;
        }
        int jk=cnt-1;
        System.out.println("jk = " + jk);
        while(jk>=0)

        {

            answer+=dict.get((int)((ans-1)/(Math.pow(26,jk))));
            ans= (int) ((ans-1)%Math.pow(26,jk));
            jk--;
        }
        System.out.println(answer);
    }
}
