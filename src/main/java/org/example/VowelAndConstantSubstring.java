package org.example;

public class VowelAndConstantSubstring {
    public static void main(String args[]) {
        String str = "inttnikjmjbemrberk";
        //inttn ikjmjb emrb erk
        int cntvwl=0;
        int cntcons=0;
        for (int i = 0; i < str.length(); i++) {
            if ( (str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u'))
            {
                cntvwl++;
            }
            else
            {
                cntcons++;
            }
        }
        System.out.println(cntvwl);
        System.out.println(cntcons);
        int answer=0;
        for(int j=0;j<str.length();j++)
        {
            if ( (str.charAt(j) == 'a') || (str.charAt(j) == 'e') || (str.charAt(j) == 'i') || (str.charAt(j) == 'o') || (str.charAt(j) == 'u'))

            {
                answer+=cntcons;
            }
            else
                cntcons--;

        }
        System.out.println(answer);

        for(int j=0;j<str.length();j++)
        {
            if ( (str.charAt(j) != 'a') && (str.charAt(j) != 'e') && (str.charAt(j) != 'i') && (str.charAt(j) != 'o') && (str.charAt(j) != 'u'))

            {
                answer+=cntvwl;
            }
            else
                cntvwl--;

        }
        System.out.println(answer);


    }
}
