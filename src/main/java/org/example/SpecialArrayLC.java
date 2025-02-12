package org.example;

public class SpecialArrayLC {
    public static void main(String args[]) {
        int nums[]={2,1,4};
        boolean toggle = false;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (((nums[i] ^ nums[i - 1]) & 1) == 0)
                System.out.println("false");
        }
        System.out.println("true");

    }
}
