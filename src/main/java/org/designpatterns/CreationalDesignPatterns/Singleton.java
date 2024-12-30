package org.designpatterns.CreationalDesignPatterns;

public class Singleton {
    // Declare the instance variable as volatile to ensure thread-safety
    private static volatile Singleton singleton;

    // Private constructor to prevent instantiation
    private Singleton() {

    }

    private Singleton getInstance() {

        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
