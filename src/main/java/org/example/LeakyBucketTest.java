package org.example;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LeakyBucketTest {
    int capacity;
    long leakrate;
    Queue<Long> queue;
    // long currenttime;

    public LeakyBucketTest(int capacity, long leakrate) {
        this.capacity = capacity;
        this.leakrate = leakrate;
        this.queue = new ArrayBlockingQueue<>(capacity);
        //this.currenttime = System.currentTimeMillis();
    }

    private void consume(long request) {
        leak();

        if (queue.size() < capacity) {

            queue.add(request);
            System.out.println("Consumed");
        } else {

            System.out.println("Not consumed");
        }

    }

    private void leak() {
        long now = System.currentTimeMillis();
        while (!queue.isEmpty()) {
            long record = queue.peek();
            if ((now - record) >= TimeUnit.SECONDS.toSeconds(leakrate)) {
                queue.poll();
            } else
                break;
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the capacity of the bucket: ");
        int capacity = scanner.nextInt();
        System.out.println("Enter the leak rate :");
        long leakrate = scanner.nextLong();
        LeakyBucketTest leakyBucketTest = new LeakyBucketTest(capacity, leakrate);
        System.out.println("Enter the number of request ");
        int request = scanner.nextInt();

        for (int i = 0; i < request; i++) {
            System.out.println("Request " + (i + 1) + " trying to consume 1 token...");
            leakyBucketTest.consume(System.currentTimeMillis());
            // Thread.sleep(90000);

        }
    }
}




