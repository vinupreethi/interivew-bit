package org.example;

public class CheckIfWordOccursAsPrefix {
    public static void main(String args[])
    {
        String sentence = "i love eating burger";
        String searchWord = "burg";

        String str[]=sentence.split("\\s+");
        for(int i=0;i< str.length;i++)
        {
            if(str[i].startsWith(searchWord))
                System.out.println(i);
        }


    }
}
