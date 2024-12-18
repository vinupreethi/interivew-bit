package org.example;


public class Add_One_number {
    public static void main(String args[]) {
        int a[] = {0, 0, 0, 1, 1, 9, 9};
        int[] answer = plusOne(a);
        for (int i = 0; i < answer.length; i++)
            System.out.println(answer[i]);
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
