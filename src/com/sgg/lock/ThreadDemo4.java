package com.sgg.lock;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadDemo4 {
    public static void main(String[] args) {

//        //  Vector解决线程安全  古老不再使用
//        List<String> list = new Vector<>();
//        //  Collections解决线程安全 古老不再使用
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
//        //  CopyOnWriteArrayList解决线程安全
//        List<String> list = new CopyOnWriteArrayList();

//        for (int i = 0; i < 50; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    list.add(UUID.randomUUID().toString().substring(0, 8));
//                    System.out.println(list);
//                }
//            },String.valueOf(i)).start();
//        }


//        Set<String> set = new CopyOnWriteArraySet<>();
//        for (int i = 0; i < 100; i++) {
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    set.add(UUID.randomUUID().toString().substring(0, 8));
//                    System.out.println(set);
//                }
//            },String.valueOf(i)).start();
//        }


//        Map<String, String> map = new HashMap<>();
        Map<String, String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 100; i++) {
            String key = String.valueOf(i);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    map.put(key, UUID.randomUUID().toString().substring(0, 8));
                    System.out.println(map);
                }
            },String.valueOf(i)).start();
        }


    }
}
