package com.study.dubbo.user;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/3/29.
 */
public class UserMain {
    public static void main(String[] args) {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:spring.xml");
        cpx.start();
        System.out.println("ok");

        synchronized (UserMain.class) {
            while (true) {
                try {
                    UserMain.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
