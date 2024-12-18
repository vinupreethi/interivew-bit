package org.example;

public class Maximum_unsorted_array_Working {
   public static void main(String args[])
   {
       int a[]={10, 20, 11, 4, 11, 11, 20, 10, 11, 11, 20, 14, 11, 20, 20  };
       int n=a.length;
       int index1=-1;
       int index2=-1;
       for(int i=0;i<n-1;i++)
       {
           if(a[i]>a[i+1])
           {
               index1=i;
               break;
           }
       }
       
       for(int i=n-2;i>=0;i--)
       {
           if(a[i]>a[i+1])
           {
               index2=i+1;
               break;
           }
       }
       int minim=a[index1];
       int maxim=a[index2];
       System.out.println("index1 = " + index1);
       System.out.println("index2 = " + index2);
        int ind1=index1;
        int ind2=index2;

       for(int i=ind1;i<=ind2;i++)
       {
           if(a[i]<minim) {
               index1=i;
               minim=a[i];

           }
           if(a[i]>maxim) {
               index2=i;
               maxim=a[i];
           }
       }

       minim=a[index1];
       maxim=a[index2];
       System.out.println("minim = " + minim);
       System.out.println("maxim = " + maxim);
       for(int i=0;i<=index1;i++)
       {
           if(a[i]>minim) {
               index1 = i;
               break;
           }
       }
       for(int i=n-1;i>=index2;i--)
       {
           if(a[i]<maxim) {
               index2 = i;
               break;
           }
       }

       System.out.println("index1+ \" \"+index2 = " + index1+ " "+index2);

   }
}
