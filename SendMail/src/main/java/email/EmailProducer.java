package email;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by java on 21.04.2017.
 */
public class EmailProducer {

    private final ArrayBlockingQueue<EmailMessage> queue;

    public EmailProducer(ArrayBlockingQueue<EmailMessage> queue) {
        this.queue = queue;
    }

    public void sendMessage(List<EmailMessage> messageList) {
        for (EmailMessage m : messageList) {
            queue.offer(m);
        }
    }
}


// ReadFile readFile=new ReadFile("message.txt");
    //String s = readFile.readFile();

    //public void start() {
      //  new Thread(() -> { //єто все ран
    //      List<EmailMessage> messageList = Arrays.asList(
    //              new EmailMessage("vorotnikovanton888@gmail.com", s, "Hello Kitty"),
    //              new EmailMessage("dp190792kdg@gmail.com", s, "home"),
    //              new EmailMessage("dp190792kdg@gmail.com", s, "visit"),
    //              new EmailMessage("dmitrij.kuzmenko@privatbank.ua", s, "Hello Kitty"),
    //              new EmailMessage("dmitrij.kuzmenko@privatbank.ua", s, "home"),
    //      new EmailMessage("dmitrij.kuzmenko@privatbank.ua", s, "visit"));
    //      for (EmailMessage m:messageList) {
    //          queue.offer(m);//добавляем в очередь через оффер
    //      }
    //  }).start();
    //}


