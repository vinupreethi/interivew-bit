package org.example;

import java.util.concurrent.TimeUnit;

class LeakyBucket
{
    long capacity;
    long water;
    long leakRate;
    long lasttime;
    LeakyBucket(long capacity,long leakRate)
    {
        this.capacity=capacity;
        this.water=0;
        this.leakRate=leakRate;
        this.lasttime=System.nanoTime();
    }


    public boolean add(long unit) {
        leak();

        if(water+unit>capacity)
            return false;
        water+=unit;
        return true;

    }

    private void leak() {
        long currentTime = System.nanoTime();
        long elapsedTime = currentTime - lasttime;

        // Calculate how much water has leaked based on elapsed time and leak rate
        long waterLeaked = TimeUnit.NANOSECONDS.toSeconds(elapsedTime) * leakRate;

        // Update the water level in the bucket, ensuring it doesn't go below zero
        water = Math.max(0, water - waterLeaked);
        lasttime = currentTime;  // Update last leak time
    }
}
public class LeakyBucketAlgorithm {
    public static void main(String args[])
    {
        LeakyBucket leakyBucket=new LeakyBucket(10,2);
        for(int i=0;i<15;i++)
        {
            System.out.println("Trying to add one unit of water "+(i+1));
            if(leakyBucket.add(1))
            {
                System.out.println("Added one unit of water "+(i+1));
            }
            else
            {
                System.out.println("Denied one unit of water as bucket is exceeding capacity ");
            }
        }
    }
}
