package com.sgg.sync;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        new Thread(() ->{
            synchronized(o1) {
                System.out.println(Thread.currentThread().getName() + "持有锁a，试图获取锁b");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(o2) {
                    System.out.println(Thread.currentThread().getName() + "获得锁b");
                }
            }

        }).start();


        new Thread(() ->{
            synchronized(o2) {
                System.out.println(Thread.currentThread().getName() + "持有锁a，试图获取锁b");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized(o1) {
                    System.out.println(Thread.currentThread().getName() + "获得锁b");
                }
            }
        }).start();


    }
}
