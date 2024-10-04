package com.sgg.ReLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class releaen2 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("aaa");
        names.add("bbb");
        names.add("ccc");
        System.out.println(names);

//        Iterator<String> it = names.iterator();
//        while(it.hasNext()) {
//            String name = it.next();
//            System.out.println(name);
//        }

//        for(String name : names){
//            System.out.println(name);
//        }

//        names.forEach(name -> System.out.println(name));
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
    }
}

