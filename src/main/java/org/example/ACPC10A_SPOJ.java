package org.example;

import java.util.Scanner;

public class ACPC10A_SPOJ {
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner scanner=new Scanner(System.in);
        while(true) {
            n1 = scanner.nextInt();
            n2 = scanner.nextInt();
            n3 = scanner.nextInt();

            if(n1==0 && n2==0 && n3==0)
                break;
            int diff1=n2-n1;
            int diff2=n3-n2;
            if(diff1 == diff2)
                System.out.println("AP " + (n3 + diff1));
            else if(n1 != 0 && n2 != 0 && n3 != 0 && n3%n2==0 && n2%n1==0) {
                float div1 = (float)(n3 / n2);
                float div2 = (float) (n2 / n1);
                if(div1== div2)
                    System.out.println("GP " + (n3 * (int) div1));
            }



        }
        scanner.close();


    }
}
