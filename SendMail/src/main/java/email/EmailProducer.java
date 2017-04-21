package email;

import java.util.Arrays;
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

    public void start(){
        new Thread(()->{ //єто все ран
            List<EmailMessage> messageList = Arrays.asList(new EmailMessage("dp190792kdg@gmail.com","testmessage","test"),
                    new EmailMessage("user1@","testmessage","test"),
                            new EmailMessage("user1@","testmessage","test"));
            for (EmailMessage m :
                    messageList) {
                queue.offer(m);//добавляем в очередь через оффер
            }
        }).start();
    }

}
