package com.company;

/**
 * Created by Дмитрий on 17.04.2017.
 */
public class Resources implements Runnable  {

    private int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getName());
        try {
            change(val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void change(int val) throws InterruptedException {
         int[]znach = {val};
        Thread thread=new Thread(){
          @Override
            public void run(){

              for (int i = 0; i<1000;i++) {
                  znach[0]++;
              }
              System.out.println("result "+znach[0]+" for "+ Thread.currentThread().getName());
          }
        };

        Thread thread2=new Thread(){
            @Override
            public void run() {
                    for (int i = 0; i < 1000; i++) {
                        znach[0]++;
                    }
                    System.out.println("result " + znach[0] + " for " + Thread.currentThread().getName());
                }
        };
        thread.start();
        thread.join();

        thread2.start();
    }
}
