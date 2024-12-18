package org.example;

public class Flip_Working {
    public static void main(String args[])
    {
        String a="1101010001";
        int len=a.length();
        int sum=0;
        int maxsum=0;
        int end=0;
        int start=0;
        for(int i=0;i<len;i++)
        {
            if(a.charAt(i)=='1')
                sum-=1;
            else if(a.charAt(i)=='0')
                sum+=1;
            
            if(sum>maxsum)
            {
                end=i;
                maxsum=sum;
            }
            if(sum<0)
            {
                sum=0;
                start=i+1;
            }

        }
        int answer[]=new int[2];
        answer[0]=start+1;
        answer[1]=end+1;
    }
}
