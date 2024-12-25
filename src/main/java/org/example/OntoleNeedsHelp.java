package org.example;

import java.util.*;

public class OntoleNeedsHelp {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int answer=arr[0];
        for (int i = 1; i < n; i++) {
            answer=answer^arr[i];
        }
        System.out.println(answer);

    }
}
