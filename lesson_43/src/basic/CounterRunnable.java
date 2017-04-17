package basic;

//import static basic.Main.print;

/**
 * Created by java on 14.04.2017.
 */
public class CounterRunnable implements Runnable {

    private int initialValue;
    private int step;
    private int maxValue;
    private final CounterPrinter counterPrinter;

    public CounterRunnable(int initialValue, int step, int maxValue, CounterPrinter counterPrinter) {
        this.initialValue = initialValue;
        this.step = step;
        this.maxValue = maxValue;
        this.counterPrinter = counterPrinter;
    }

    @Override
    public void run() {
        counterPrinter.print(Thread.currentThread().getName() +" fgf ");
//        for (int i=initialValue;i<maxValue;i+=step) {
//            print(Thread.currentThread().getName() + " " + i);
//            try {
//                Thread.sleep(250);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }


}
