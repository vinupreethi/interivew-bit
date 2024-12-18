package org.example;

public class SalutesInterviewBit {
    public static void main(String args[])
    {
        String a=">>><<<";
        int n=a.length();
        int cntopen=0;
        int cntclose=0;
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i)=='>')
            {
                cntopen++;

            }
            else
                cntclose++;
        }
        int answer=0;
        for(int j=0;j<n;j++)
        {
            if(a.charAt(j)=='>')
                answer+=cntclose;
            else
                cntclose--;
        }
        System.out.println(answer);
    }
}
