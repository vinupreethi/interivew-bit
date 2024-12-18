package org.example;

public class ZigZagInterview {
    public static void main(String args[]) {
        String a = "ABCD";
        //0 1 2 1 0 1
        int b = 2;
    String answer="";
        String str[] = new String[b];
        for(int i=0;i<b;i++)
            str[i]="";
        int direction = 0;
        int cnt = 0;
        for (int j = 0; j < a.length(); j++) {
            if (direction == 0) {

                str[cnt] += a.charAt(j);
                cnt++;
                if (cnt == b) {
                    direction = 1;
                    cnt=b-1;
                }
            } else {
                cnt--;
                str[cnt] += a.charAt(j);
                if (cnt == 0) {
                    direction = 0;
                    cnt=1;
                }
            }
        }
//        System.out.println(str[0]);
//        System.out.println(str[1]);
//        System.out.println(str[2]);
        for(int k=0;k<b;k++)
            answer+=str[k];
        System.out.println(answer);

    }
}
