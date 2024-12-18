
package org.example;

import java.util.ArrayDeque;


class RequestDetails {
    int weightage;
    long timestamp;

    RequestDetails(int weightage, long timestamp) {
        this.weightage = weightage;
        this.timestamp = timestamp;
    }
}

public class SlidingWindowTest {
    int framecapacity;
    long currenttimestamp;
    ArrayDeque<RequestDetails> arr = new ArrayDeque<>();

    public SlidingWindowTest(int framecapacity) {
        this.framecapacity = framecapacity;
        this.currenttimestamp = System.currentTimeMillis();
    }


    private void printtherequest() {
        System.out.println(arr);

    }

    private boolean allowRequest(int request) {
        printtherequest();
        long now = System.currentTimeMillis();
        RequestDetails requestDetails = new RequestDetails(request, now);
        while (!arr.isEmpty() && (now - arr.peekFirst().timestamp) / 1000 >= framecapacity) {
            arr.pollFirst();
        }

        int difference = framecapacity - arr.size();
        boolean requestadded=true;
        for (int i = 1; i <= requestDetails.weightage && difference > 0; i++) {
            arr.add(requestDetails);
            difference--;

        }
        return true;


    }

    public static void main(String args[]) throws InterruptedException {
        SlidingWindowTest slidingWindowTest = new SlidingWindowTest(5);
//        for (int i = 0; i < 20; i++) {
//            Scanner scanner=new Scanner(System.in);
//            int request=scanner.nextInt();
//            if (slidingWindowTest.allowRequest(1)) {
//                System.out.println("Request is consumed");
//            } else {
//                System.out.println("Request is not consumed");
//            }
//            slidingWindowTest.printtherequest();
//        }


    }


}

