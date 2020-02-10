package com.designpatterns;

public class Singleton {

    /*
    *
    * Singleton
    *
    * - Static in nature
    * - private constructor
    * - thread safe
    * - private instance of class
    * - no parameter to the constructor
    *
    */

    private static volatile Singleton instance = null;

    Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
