package com.sgg.JUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    final static int NUMBER = 7;

    public static void main(String[] args) {


        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER, () -> {
            System.out.println("***集齐七颗龙珠就可召唤神龙");
        });
        for (int i = 0; i < 7; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + " 星龙被收集到了");
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }, String.valueOf(i)).start();
        }


    }
}
