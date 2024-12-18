package org.example;

public class SlidingWindowCounter {
    long timeframe;
    long request;
    long currentime;
    long currentcnt;


    public SlidingWindowCounter(long timeframe, long request) {
        this.timeframe = timeframe;
        this.request = request;
        this.currentime=System.currentTimeMillis();
        this.currentcnt=0;
    }
    private boolean checkCurrentRequestFrame(long timeframe) {
        long timenow=System.currentTimeMillis();
        while (currentime - timenow >= timeframe) {
            currentime= timenow; // Reset the window start time
            currentcnt--; // Reset the request count for the new window
        }

        // If the number of requests in the window exceeds the max limit, deny the request
        if (currentcnt < request) {
            currentcnt++; // Allow the request and increment the count
            return true;
        }
        return false;
    }
    public static void main(String args[]) throws InterruptedException {
        long timeframe= (long) 0.05;
        SlidingWindowCounter slidingWindowCounter = new SlidingWindowCounter(timeframe, 2);
        for(int i=0;i< 20;i++)
        {
            System.out.println("We are getting a new request "+(i+1));
            if(slidingWindowCounter.checkCurrentRequestFrame(timeframe))
            {
                System.out.println("Request is allowed "+(i+1));
            }
            else
                System.out.println("Request is denied "+(i+1));

        }
        Thread.sleep(10000);


    }


}