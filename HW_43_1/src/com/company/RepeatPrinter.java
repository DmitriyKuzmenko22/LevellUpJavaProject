package com.company;

/**
 * Created by Дмитрий on 17.04.2017.
 */
public class RepeatPrinter extends Thread {
    private int value;
    private String text;

    public RepeatPrinter(int value, String text){
        this.value=value;
        this.text=text;
    }

    @Override
    public void run(){
        synchronized (this) {
            for (int i = 0; i <= value; i++) {
                System.out.println(text + " " + Thread.currentThread().getName());
            }
        }
    }
}
