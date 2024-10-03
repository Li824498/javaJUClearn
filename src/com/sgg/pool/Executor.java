package com.sgg.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
//        //一池N线程
//        ExecutorService threadPool1 = Executors.newFixedThreadPool(5);
//
//        try {
//            for (int i = 0 ; i < 10 ; i++) {
//                threadPool1.execute(new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println(Thread.currentThread().getName() + "办理业务");
//                    }
//                });
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            threadPool1.shutdown();
//        }


//        //一池一线程
//        ExecutorService threadPool1 = Executors.newSingleThreadExecutor();
//
//        try {
//            for (int i = 0 ; i < 10 ; i++) {
//                threadPool1.execute(new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println(Thread.currentThread().getName() + "办理业务");
//                    }
//                });
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            threadPool1.shutdown();
//        }

        //一池可扩容线程
        ExecutorService threadPool1 = Executors.newCachedThreadPool();

        try {
            for (int i = 0 ; i < 10 ; i++) {
                threadPool1.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() + "办理业务");
                    }
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool1.shutdown();
        }



    }
}
