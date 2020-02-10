package com.designpatterns;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LaunchSingleton {

    public static void main(String[] args) {

        Singleton singletonFirstInstance = Singleton.getInstance();
        log.info("First instance of singleton => {}", singletonFirstInstance);

        Singleton singletonSecondInstance = Singleton.getInstance();
        log.info("Second instance of singleton => {}", singletonSecondInstance);

        /* OUTPUT : when run main method
        *
        * 00:44:23.523 [main] INFO com.designpatterns.LaunchSingleton - First instance of singleton ==> com.designpatterns.Singleton@131276c2
        * 00:44:23.531 [main] INFO com.designpatterns.LaunchSingleton - Second instance of singleton ==> com.designpatterns.Singleton@131276c2
        *
        * As you observe above the single object is created
        *
        * Eg:
        *  1 Runtime.getRuntime
        *  2 Spring Beans
        *  3 Logger
        *
        */
    }
}
