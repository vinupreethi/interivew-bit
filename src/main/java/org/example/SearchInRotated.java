package org.example;

public class SearchInRotated {
    public static void main(String args[]) {
        int a[] = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 4;
        int low=0;
        int high=a.length-1;

        while(low <= high)
        {
            int mid= (low+high)/2;

            if(a[low]<=a[mid])
            {
               if(a[low]<=target && target<=a[mid])
               {
                   high=mid-1;
               }
               else
               {
                   low=mid+1;
               }

            }
            else
            {
                if(a[mid]<=target && target<=a[high])
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
        }


    }
}
