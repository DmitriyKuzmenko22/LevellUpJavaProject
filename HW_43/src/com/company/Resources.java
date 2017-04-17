package com.company;

/**
 * Created by Дмитрий on 17.04.2017.
 */
public class Resources {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void changeI() {
        synchronized (this) {
            int i = this.i;
            if (Thread.currentThread().getName().equals("one")) {
                Thread.yield();
            }
            i++;
            this.i = i;
        }
    }
}
