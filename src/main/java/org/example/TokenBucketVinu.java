package org.example;

public class TokenBucketVinu {

    int capacity;
    int refillrate;
    int currentcapacity;
    long currenttime;

    public TokenBucketVinu(int capacity, int refillrate) {
        this.capacity = capacity;
        this.currentcapacity = capacity;
        this.refillrate = refillrate;
        this.currenttime = System.currentTimeMillis();
    }

    private boolean consume(int token) {
        refill();
        if(currentcapacity-token>0) {
            currentcapacity -= token;
            return true;
        }
        return false;

    }

    private void refill() {
        long time = System.currentTimeMillis();
        long diff = time - currenttime;
        long tokens= diff * refillrate;
        if (tokens > 0) {
            currentcapacity = Math.max(currentcapacity + (int) tokens, capacity);
            currenttime = System.currentTimeMillis();
        }



    }

    public static void main(String args[]) {
        TokenBucketVinu tokenBucketVinu = new TokenBucketVinu(5, 2);
        for (int i = 0; i < 15; i++) {
            System.out.println("Trying to consumer 1 token " + (i + 1));
            if (tokenBucketVinu.consume(1)) {
                System.out.println("Request accepted by Consuming 1 token " + (i + 1));
            } else
                System.out.println("Request denied. Ignored 1 token " + (i + 1));
        }
    }


}
