package com.company;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

       /* new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();*/



      /*  RepeatPrinter repeatPrinter = new RepeatPrinter(3,"rrt");
        RepeatPrinter repeatPrinter2 = new RepeatPrinter(2,"plplp");
        repeatPrinter.start();
        repeatPrinter2.start();*/

       // MyThread myThread = new MyThread();

        Resources resources=new Resources();
        resources.setVal(4);
        resources.run();
        //resources.setStart(4);


     //   bunchOf();


    }


    public  static  void bunchOf() throws InterruptedException {
        Thread thread = new Thread();

        thread.start();

        System.out.println(Thread.currentThread().getName() + " 99");

        RepeatPrinter repeatPrinter = new RepeatPrinter(2, "testoTest");
        repeatPrinter.start();
        repeatPrinter.join();

        new MyThread().start();
        new MyThread().start();

    }
}

