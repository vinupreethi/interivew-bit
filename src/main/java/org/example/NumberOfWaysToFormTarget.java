package org.example;

public class NumberOfWaysToFormTarget {
    //static int count=0;
    public static void main(String args[]) {
        String words[] = {"acca",
                "bbbb",
                "caca"};
        String target = "aba";
        int answer = numberWays(words, target, 0, 0);
        System.out.println(answer);
    }

    private static int numberWays(String[] words, String target, int i, int j) {
        if(j==target.length())
            return 1;
        if(i==words[0].length() || words[0].length()-i< target.length()-j)
            return 0;
        int count=0;
        for (int index = 0; index < words.length; index++) {
            if (words[index].charAt(i) == target.charAt(j))
                count+=numberWays(words, target, i + 1, j + 1)%1000000007;
        }
        count+=numberWays(words,target,i+1,j)%1000000007;
        return count%1000000007;
    }
}
