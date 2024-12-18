package org.example;

import javax.sound.midi.Soundbank;

public class FixedWindowCounter {

    long timeframe;
    long request;
    long currentime;
    long currentcnt;

    public FixedWindowCounter(long timeframe, long request) {
        this.timeframe = timeframe;
        this.request = request;
        this.currentime=System.currentTimeMillis();
        this.currentcnt=0;
    }
    private boolean checkCurrentRequestFrame(long timeframe) {
        long timenow=System.currentTimeMillis();
        if (currentime - timenow >= timeframe) {
            currentime= timenow; // Reset the window start time
            currentcnt = 0; // Reset the request count for the new window
        }

        // If the number of requests in the window exceeds the max limit, deny the request
        if (currentcnt < request) {
            currentcnt++; // Allow the request and increment the count
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        long timeframe= (long) 1/30;
        FixedWindowCounter fixedWindowCounter = new FixedWindowCounter(timeframe, 2);
        for(int i=0;i< 20;i++)
        {
            System.out.println("We are getting a new request "+(i+1));
            if(fixedWindowCounter.checkCurrentRequestFrame(timeframe))
            {
                System.out.println("Request is allowed "+(i+1));
            }
            else
                System.out.println("Request is denied "+(i+1));

        }


    }


}
