package org.example;

import java.util.concurrent.TimeUnit;

class TokenBucket {
    private final long capacity;         // Max number of tokens the bucket can hold
    private long tokens;                 // Current number of tokens in the bucket
    private final long refillRate;       // Tokens added to the bucket per second
    private long lastRefillTime;

    TokenBucket(long capacity, long refillRate) {
        this.capacity = capacity;
        this.tokens = capacity;         // Initially fill the bucket to its capacity
        this.refillRate = refillRate;   // Tokens are added at this rate
        this.lastRefillTime = System.nanoTime();
    }


    public boolean consume(long tokensneedtobeconsumed) {
        refill();
        tokens-=tokensneedtobeconsumed;
        if(tokens<0)
            return false;
        return true;
    }

    private void refill() {
        long currentTime = System.nanoTime();
        long elapsedTime = currentTime - lastRefillTime;

        // Calculate how many tokens should be added based on elapsed time and refill rate
        long tokensToAdd = TimeUnit.NANOSECONDS.toSeconds(elapsedTime) * refillRate;
        System.out.println(tokensToAdd);
        // Update the token count, ensuring it doesn't exceed the bucket's capacity
        tokens = Math.min(capacity, tokens + tokensToAdd);
        lastRefillTime = currentTime;
    }

    public long getTokens() {
        refill();  // Refills the bucket before getting the token count
        return tokens;
    }
}


public class TokenBucketAlgorithm {

    public static void main(String args[]) throws InterruptedException {
        TokenBucket bucket = new TokenBucket(10, 1);
        for (int i = 0; i < 15; i++) {
            System.out.println("Request " + (i + 1) + " trying to consume 1 token...");
            if (bucket.consume(1)) {
                System.out.println("Request " + (i + 1) + " allowed. Tokens remaining: " + bucket.getTokens());
            } else {
                System.out.println("Request " + (i + 1) + " denied. Not enough tokens.");
            }

            // Simulate a delay between requests (1 second for example)
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
