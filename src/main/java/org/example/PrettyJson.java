package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrettyJson {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int i = 0;
        List<String> arr = new ArrayList<>();
        String ans = "";
        String indent="";
        while (i < a.length()) {


            if (a.charAt(i) == '{' || a.charAt(i) == '[' || a.charAt(i) == ']' || a.charAt(i) == '}') {
                if (ans != "")
                    arr.add(ans);
                 indent+=" ";
                if (String.valueOf(a.charAt(i)) != " ")
                    arr.add(String.valueOf(a.charAt(i)));
                ans = "";
            } else {
                ans += a.charAt(i);
                if (a.charAt(i) == ',') {
                    arr.add(ans);
                    ans = "";
                }

            }
            indent+=" ";
            i++;
        }

        for (String a1 : arr)
            System.out.println(a1);

    }
}
