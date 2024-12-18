package org.example;

public class SearchInRotatedArr {
    public static void main(String args[])
    {
        int low=0;
        int a[]={4,5,6,7,0,1,2};
        int target=3;
        int high=a.length-1;
        int index=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]==target)
            {
                index=mid;
                break;
            }
            if(a[low]<= target && target<a[mid]) {
                high = mid - 1;
            }
            else if(a[low]<=target && target > a[mid])
            {
                low=mid+1;
            }
            else if(a[low]>target && target<=a[mid])
            {
                low=mid+1;
            }
            else if(a[low]>target && target > a[mid])
            {
                high=mid-1;
            }
        }
        System.out.println(index);
    }
}
