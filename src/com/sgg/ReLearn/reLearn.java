package com.sgg.ReLearn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reLearn {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
//        oi.test();

        String names = "123456789";
        System.out.println(names.substring(0, 3));
        System.out.println(names.substring(3));

        JFrame jf = new JFrame("登录窗口");

        JPanel panel = new JPanel();
        jf.add(panel);

        jf.setSize(400, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("登录");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("111");
            }
        });
        panel.add(jb);

        jf.setVisible(true);

        String num = "1234";
        int aa = Integer.valueOf(num);

        System.out.println(aa);

    }


    public static class Outer{
        public class Inner {
            public void test() {
                System.out.println("111");
            }
        }
    }

}


