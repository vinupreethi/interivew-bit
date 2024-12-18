package org.example;

public class ContainerWithMostWater {

    public static void main(String args[]) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = 0;
        int j = height.length - 1;
        int result=Integer.MIN_VALUE;
        while (i <= j) {
            result= Math.max(result,(j-i) * Math.min(height[i],height[j]));
            if(height[i]<=height[j])
                i++;
            else
                j--;
            
       
            
            
        }
        System.out.println("result = " + result);
    }
}
