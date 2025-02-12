package org.example;

public class SeatGreedyOtherApproach {
    public static void main(String args[]) {
        String a = "x......x";
        int i = 0;
        int j = a.length() - 1;
        int countIDot = 0;
        int countJDot = 0;
        int countIX = 0;
        int countJX = 0;
        int total = 0;
        while (i < j) {
            if (a.charAt(i) == '.') {
                i++;
                countIDot++;
            } else if (a.charAt(j) == '.') {
                j--;
                countJDot++;
            } else {
                total += countIDot * countIX + countJDot * countJX;
                countIX++;
                countJX++;
                countIDot = 0;
                countJDot = 0;
                i++;
                j--;
            }
        }
        if (i == j && a.charAt(i) == a.charAt(j)) {
            countIDot++;
        }
        total += countIDot * countIX + countJDot * countJX;

        System.out.println(total);
    }
}
