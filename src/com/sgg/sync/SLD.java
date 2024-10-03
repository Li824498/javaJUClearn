package com.sgg.sync;

public class SLD {
    public static void main(String[] args) {
//        Object o = new Object();
//        new Thread(() ->{
//            synchronized (o){
//                System.out.println(Thread.currentThread().getName() + "外层");
//                synchronized (o){
//                    System.out.println(Thread.currentThread().getName() + "中层");
//                    synchronized (o){
//                        System.out.println(Thread.currentThread().getName() + "内层");
//                    }
//                }
//            }
//        }).start();

        new SLD().add();
    }

    public synchronized void add() {
        add();
    }

}
