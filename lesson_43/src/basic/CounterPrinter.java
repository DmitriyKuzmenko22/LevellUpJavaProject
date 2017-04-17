package basic;

/**
 * Created by Дмитрий on 17.04.2017.
 */
public class CounterPrinter {
    public synchronized void print(String text) {
        for (int i = 0; i < 10; i ++) {
            System.out.println(text + " " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
