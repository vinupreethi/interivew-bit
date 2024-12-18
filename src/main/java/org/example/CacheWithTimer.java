/*
package org.example;

public class CacheWithTimer {


    public static void main(String args[])
    {
        CacheWithTimer cache = new CacheWithTimer(2, 5000);  // TTL = 5 seconds
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));  // Should return 1
        cache.put(3, 3);  // Evicts key 2
        System.out.println(cache.get(2));  // Should return -1 (expired)
        cache.put(4, 4);  // Evicts key 1
        System.out.println(cache.get(1));  // Should return -1 (expired)
        System.out.println(cache.get(3));  // Should return 3
        System.out.println(cache.get(4));  // Should return 4
    }

}
*/
