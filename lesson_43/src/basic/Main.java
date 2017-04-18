package basic;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {


    /*    Thread thread=new Thread(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName());

                for (int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+" пп "+ i);
                }
            }
        };

        thread.start();// запускаем наш второй поток

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+ i);// получаем ссілку на текущий поток (которій віполняем) и его им
        }*/

       /* basic.CounterThread thread1=new basic.CounterThread(1,1,17);
        basic.CounterThread thread2=new basic.CounterThread(0,5,26);
        thread1.setName("New counter thread");
        thread1.start();
        thread2.start();*/
      /*  ExecutorService executorService= Executors.newFixedThreadPool(2);

        CounterPrinter counterPrinter=new CounterPrinter();


        executorService.execute(new basic.CounterRunnable(1,2,13, counterPrinter));
        executorService.execute(new basic.CounterRunnable(17,10,99, counterPrinter));*/
//        executorService.execute(new basic.CounterRunnable(4,3,36));
//        executorService.execute(()-> System.out.println("Hello world"));

//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//
//                System.out.println(Thread.currentThread().getName());
//                Thread thread = new Thread(new CounterRunnable(1,2,1000));
//                thread.start();
//
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName()+ " finished");
//            }
//        });
//
//        System.out.println(Thread.currentThread().getName()+ " finished");
//
//
        /*executorService.shutdown();*/

        /* Atomic
        Client c1 = new Client(1);
        Client c2 = new Client(2);
        Client c3 = new Client(3);
        Client c4 = new Client(4);

        ExecutorService executorService = Executors.newCachedThreadPool(); //сам определяет какое количеаство потоков віделить

        Semaphore semaphore = new Semaphore(3);

        executorService.execute(() -> {
            try {
                semaphore.acquire();

                c1.increaseBalance(50);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c2.increaseBalance(25);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c3.reduceBalance(25);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); //75

        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c1.increaseBalance(25);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c1.reduceBalance(100);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); //75

        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c2.increaseBalance(50);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c2.increaseBalance(100);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c2.reduceBalance(75);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); //200


        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c4.increaseBalance(75);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c4.increaseBalance(75);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(() -> {
            try {
                semaphore.acquire();
                c4.reduceBalance(200);
                Thread.sleep(200);

                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); //50
//
//
//        Thread.sleep(2000);
//


        System.out.println("Client 1: " + c1.getBalance());
        System.out.println("Client 2: " + c2.getBalance());
        System.out.println("Client 3: " + c3.getBalance());
        System.out.println("Client 4: " + c4.getBalance());

        executorService.shutdown();
*/
        //    public static synchronized void print(String text){
        //        System.out.println(text);
        //    }
        // запускаме все рандомно

        CountDownLatch latch=new CountDownLatch(5);
        new CountDownThread(latch,"Bob").start();
        Thread.sleep(500);
        new CountDownThread(latch,"Gil").start();
        Thread.sleep(500);
        new CountDownThread(latch,"Tom").start();
        Thread.sleep(500);
        new CountDownThread(latch,"Barbara").start();
        Thread.sleep(500);

        new CountDownThread(latch,"Anton").start();
    }

    public static void sendMail(String sender){
        System.out.println("Email sent from "+ sender);
    }

    static class CountDownThread extends Thread{
        private final CountDownLatch latch;
        private final String sender;

        CountDownThread(CountDownLatch latch, String sender) {
            this.latch = latch;
            this.sender = sender;

            latch.countDown();
        }

        @Override
        public void run() {
            System.out.println("Waiting for last sender");
            try {
                latch.await();//проверяем сколько уже собралось в очереди
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Begin email processing from" + sender);
            sendMail(sender);
        }
    }
}
