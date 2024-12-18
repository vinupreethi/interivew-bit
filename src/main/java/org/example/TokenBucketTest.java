package org.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TokenBucketTest {
    int capacity;
    long timeinterval;
    int numberoftoken;
    long currenttime;
    int currentcapacity;

    TokenBucketTest(int capacity, long timeinterval, int numberoftoken) {
        this.capacity = capacity;
        this.timeinterval = timeinterval;
        this.numberoftoken = numberoftoken;
        this.currenttime = System.currentTimeMillis();
        this.currentcapacity = capacity;
    }

    private boolean isTokenAvailableToConsume(int token) {
        refill();
        if ((currentcapacity - token) >= 0) {
            currentcapacity -= token;
            return true;
        }
        return false;
    }


    private void refill() {
        long present = System.currentTimeMillis();
        long difference = present-currenttime;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(difference);
        long tokenstobeadded = (minutes / timeinterval) * numberoftoken;
        currentcapacity = (int) Math.min(tokenstobeadded + currentcapacity, capacity);
        currenttime=present;

    }


    public static void main(String args[]) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of Bucket: ");
        int capacity = scanner.nextInt();
        System.out.println("Enter the interval for refiller: ");
        long timeinterval = scanner.nextLong();
        System.out.println("Enter the number of token to be refilled: ");
        int numberoftoken = scanner.nextInt();
        TokenBucketTest tokenBucketTest = new TokenBucketTest(capacity, timeinterval, numberoftoken);
        System.out.println("Enter the number of request: ");
        int request = scanner.nextInt();


        for (int i = 0; i < request; i++) {
            System.out.println("Request " + (i + 1) + " trying to consume 1 token...");

            if (tokenBucketTest.isTokenAvailableToConsume(1)) {
                System.out.println("Request " + (i + 1) + " allowed. ");

            } else {
                System.out.println("Request " + (i + 1) + " Denied. ");
            }

            Thread.sleep(90000);

        }


    }


}


