package com.company;

/**
 * Created by Дмитрий on 17.04.2017.
 */
public class MyThread2 extends Thread {
   Resources resources;

    public void setResources(Resources resources) {
        this.resources = resources;
    }
    @Override
    public void  run(){
        resources.changeI();
        System.out.println("Hello World" + " "+ Thread.currentThread().getName());
    }
}
