package com.sgg.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(new MyThread(), "aa").start();

        // 写法一
        new Thread(new FutureTask(new MyThread2()), "bb").start();

        // 写法二
        FutureTask<Integer> futureTask2 = new FutureTask<>(() ->  {
            System.out.println(Thread.currentThread().getName() + "is");
            return 1024;
        });

        new Thread(futureTask2, "LUCY").start();
        try {
            System.out.println(futureTask2.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }



    }


}

class MyThread implements Runnable{
    @Override
    public void run() {

    }
}

class MyThread2 implements Callable {
    @Override
    public Object call() throws Exception {
        return null;
    }
}
