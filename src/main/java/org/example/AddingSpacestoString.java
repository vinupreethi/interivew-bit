package org.example;

public class AddingSpacestoString {
    public static void main(String args[])
    {
        String str="LeetcodeHelpsMeLearn";
        int spaces[] = {8,13,15};
        StringBuffer answer=new StringBuffer();
        int j=0;
        for(int i=0;i<str.length();i++)
        {

            if(j!=spaces.length) {
                if (i == spaces[j]) {
                    answer.append(" ");
                    j++;
                }
            }
            answer.append(str.charAt(i));
        }
        System.out.println(answer);
    }
}
