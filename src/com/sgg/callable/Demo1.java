package com.sgg.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) {
        new Thread(new MyThread(), "aa").start();


        new Thread(new FutureTask(new MyThread2()), "bb").start();

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
