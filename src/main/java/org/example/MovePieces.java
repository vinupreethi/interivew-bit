package org.example;

public class MovePieces {
    public static void main(String args[]) {
        String start = "_L__R__R_";
        String destination = "L______RR";
        int i = 0;
        int j = 0;
        while (i < start.length() && j < destination.length()) {

            while (start.charAt(i) == '_') {
                i++;
            }
            while (destination.charAt(j) == '_') {
                j++;
            }
            if (i == start.length() && j == destination.length()) {
                System.out.println(true);
            }
            if (i >= start.length() && j < destination.length()) {
                System.out.println(false);
            }
            if (j >= destination.length() && i < start.length()) {
                System.out.println(false);
            }

            if (i < j && start.charAt(i) == 'L' && destination.charAt(j) == 'L') {
                System.out.println(false);
            }
            if (i > j && start.charAt(i) == 'R' && destination.charAt(j) == 'R') {
                System.out.println(false);
            }
            if (start.charAt(i) != destination.charAt(j)) {
                System.out.println(false);
            }

            i++;
            j++;

        }
        while (start.charAt(i) == '_') {
            i++;
        }
        while (destination.charAt(j) == '_') {
            j++;
        }
        if (i >= start.length() && j < destination.length()) {
            System.out.println(false);
        }
        if (j >= destination.length() && i < start.length()) {
            System.out.println(false);
        }
    }
}
