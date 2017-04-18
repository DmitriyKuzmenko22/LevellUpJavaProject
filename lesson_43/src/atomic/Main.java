
import atomic.Client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class Main {

//
//    public static volatile int number = 17;
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread() {
//
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//
//                for(int i = 0; i < 10; i++) {
//                    System.out.println(Thread.currentThread().getName() + " & " + i);
//                }
//            }
//        };
//
//        thread.start();
//
//
//        for(int i = 0; i < 10; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }

//        basic.CounterThread thread1 = new basic.CounterThread(1, 1, 17);
//        basic.CounterThread thread2 = new basic.CounterThread(0, 5, 26);
//
//        thread1.setName("New counter thread");
//
//        thread1.start();
//        thread2.start();



//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//
//        CounterPrinter printer = new CounterPrinter();
//
//        executorService.execute(new basic.CounterRunnable(1, 2, 13, printer));
//        executorService.execute(new basic.CounterRunnable(17, 10, 99, printer));
//        executorService.execute(new basic.CounterRunnable(4, 3, 36, printer));
//        executorService.execute(() -> System.out.println("Hello world"));
//


//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//
//                Thread thread = new Thread(new CounterRunnable(1, 1, 1000));
//                thread.start();
//
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println(Thread.currentThread().getName() + " finished");
//            }
//        });
//
//        System.out.println(Thread.currentThread().getName() + " finished");


//        executorService.shutdown();

   /*     new MyIncThread().start();
        new MyIncThread().start();
        new MyIncThread().start();
        new MyIncThread().start();
        new MyIncThread().start();*/


        /* Atomic */
//        Client c1 = new Client(1);
//        Client c2 = new Client(2);
//        Client c3 = new Client(3);
//        Client c4 = new Client(4);
//
//
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        executorService.execute(() -> c1.increaseBalance(50));
//
//        executorService.execute(() -> c2.increaseBalance(25));
//
//        executorService.execute(() -> c3.reduceBalance(25)); //75
//
//        executorService.execute(() -> c1.increaseBalance(25));
//        executorService.execute(() -> c1.reduceBalance(100)); //75
//
//        executorService.execute(() -> c2.increaseBalance(50));
//        executorService.execute(() -> c2.increaseBalance(100));
//        executorService.execute(() -> c2.reduceBalance(75)); //200
//
//
//        executorService.execute(() -> c4.increaseBalance(75));
//        executorService.execute(() -> c4.increaseBalance(75));
//        executorService.execute(() -> c4.reduceBalance(200)); //50
//
////
//        Thread.sleep(2000);
//
//        System.out.println("Client 1: " + c1.getBalance());
//        System.out.println("Client 2: " + c2.getBalance());
//        System.out.println("Client 3: " + c3.getBalance());
//        System.out.println("Client 4: " + c4.getBalance());
//
//        executorService.shutdown();
  /*  }

    public static *//*synchronized*//* void inc() {
        for (int i = 0; i < 1000; i++) {
            Main.number += 1;
        }
        System.out.println(Main.number + " " + Thread.currentThread().getName());
    }

}
*/