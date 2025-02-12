package org.example;

import java.util.HashMap;

public class ClearDigits {
    public static void main(String args[]) {
        String str = "aa3bc12";

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            } else {
                stringBuilder.append(str.charAt(i));
            }
        }
        System.out.println(stringBuilder.toString());


    }
}
