package com.sgg.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LSaleTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "C").start();
    }

}

class Ticket{
    private int number = 30;
    private final ReentrantLock lock = new ReentrantLock(true);

    public void sale() {
        lock.lock();

        try {
            if(number > 0) {
                System.out.println(Thread.currentThread().getName() + "剩下" + --number);
            }
        } finally {
            lock.unlock();
        }
    }
}
