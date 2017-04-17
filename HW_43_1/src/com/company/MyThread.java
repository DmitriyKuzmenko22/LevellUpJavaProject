package com.company;

/**
 * Created by Дмитрий on 17.04.2017.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("Hello World" + " " + Thread.currentThread().getName());
    }
}
