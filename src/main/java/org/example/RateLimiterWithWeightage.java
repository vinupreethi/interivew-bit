package org.example;

import java.util.ArrayDeque;

class Request {
    int requestWeightage;
    long timestamp;

    Request(int requestWeightage, long timestamp) {
        this.requestWeightage = requestWeightage;
        this.timestamp = timestamp;
    }

}

class RateLimiter {
    int capacityofRateLimiter;
    long windowcurrentTime;
    ArrayDeque<Request> slidingWindowQueue = new ArrayDeque<>();

    RateLimiter(int capacityofRateLimiter) {
        this.capacityofRateLimiter = capacityofRateLimiter;
        this.windowcurrentTime = System.currentTimeMillis();
    }


    boolean isRequestAllowed(Request request) {
        slidingCurrentWindow();
        if (slidingWindowQueue.size() >= capacityofRateLimiter) {
            System.out.println("Rate limiter has reached its capacity and hence cannot accomodate more request..");
            return false;
        }

        int numberOfAllowedRequest = capacityofRateLimiter - slidingWindowQueue.size();
        while (numberOfAllowedRequest >= 0) {
            slidingWindowQueue.add(request);
        }
        return true;
    }

    private void slidingCurrentWindow() {
        System.out.println("Sliding the window based on its current timestamp..");
        long currenttime = System.currentTimeMillis();
        long timestampOfFirstRequest = slidingWindowQueue.peekFirst().timestamp;


        //If the capacity of the rate limiter is lesser than the timestamp
        while (!slidingWindowQueue.isEmpty() && (currenttime - timestampOfFirstRequest) / 1000 > capacityofRateLimiter) {

            slidingWindowQueue.poll();
            timestampOfFirstRequest = slidingWindowQueue.peekFirst().timestamp;
        }
    }


}

public class RateLimiterWithWeightage {

    RateLimiter rateLimiter = new RateLimiter(5);
    // Example requests with different weightages
    Request request1 = new Request(10, System.currentTimeMillis());  // Request with weightage 10
    Request request2 = new Request(20, System.currentTimeMillis());
    Request request3 = new Request(30, System.currentTimeMillis());



}
