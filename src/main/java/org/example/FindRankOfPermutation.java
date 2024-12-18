package org.example;

public class FindRankOfPermutation {
    public static void main(String args[]) {
        int length = 4;
        int rank = 8;
        int fact = factorial(length);
        int diff = fact / length;
        int j = 1;
        String answer = "";
        for (int i = 1; i <= fact; i += diff) {
            if ((i <= rank) && (rank <= (i + diff-1)))
                answer += String.valueOf(j);
            j++;
        }
        System.out.println("answer = " + answer);


    }

    private static int factorial(int length) {
        int answer = 1;
        for (int i = 2; i <= length; i++)
            answer = answer * i;

        return answer;
    }

}
