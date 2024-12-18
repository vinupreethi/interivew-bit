package org.example;

public class DivisiblityBy60 {
    public static void main(String args[])
    {
        int a[]={  4, 1, 3, 1, 5, 5, 4, 2, 2, 3};
        int sum=0;
        int flag=0;
        int flag1=0;
        String result="";
        String result1="";
        if(a.length==2) {
            result += a[0];
            result += a[1];
            result1 += a[1];
            result1 += a[0];

            int res = Integer.parseInt(String.valueOf(result));
            int res1 = Integer.parseInt(String.valueOf(result1));

            if (res >= 60 || res1 >= 60)
                System.out.println(1);
        }

        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
            if(a[i]%2==0)
            {
                flag=1;
            }
            if(a[i]==0)
            {
                flag1=1;
            }
        }
        if(sum%3==0 && flag==1 && flag1 == 1)
            System.out.println("1");



    }



}
