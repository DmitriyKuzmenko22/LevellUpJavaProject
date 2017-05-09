package email.sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Дмитрий on 23.04.2017.
 */
public class EmailSenderFromFileList {

    private List<EmailMessage> messages = new ArrayList<>();


    public EmailSenderFromFileList() throws IOException {

    }

    private EmailMessage parseEmailMessage(String line) {
        String str[] = line.split(",");
        return new EmailMessage(str[0], str[2], str[1]);
    }

    private void readFromFile(RandomAccessFile file) throws IOException {
        file.seek(0);
        String str;
        while ((str = file.readLine()) != null) {
            messages.add(parseEmailMessage(str));
        }
    }

    public void startSender(File currentFile) throws InterruptedException, IOException {
        RandomAccessFile file = new RandomAccessFile(currentFile, "r");
        readFromFile(file);
        ArrayBlockingQueue<EmailMessage> queue = new ArrayBlockingQueue<>(messages.size());
        new Thread(() -> {
            for (EmailMessage message : messages) {
                queue.offer(message);
            }
        }).start();

        EmailConsumer consumer1 = new EmailConsumer(queue);
        EmailConsumer consumer2 = new EmailConsumer(queue);
        EmailConsumer consumer3 = new EmailConsumer(queue);

        consumer1.start();
        consumer2.start();
        consumer3.start();

        Thread.sleep(30000);
    }
}


   /* private RandomAccessFile randomAccessFile;

    public EmailSenderFromFileList(String file) throws FileNotFoundException {
        randomAccessFile=new RandomAccessFile(file,"r");
    }

    public String readFile() throws IOException {
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = randomAccessFile.readLine()) != null){
            builder.append(line);
        }
        return builder.toString();
    }
*/

    /*
    public static void openTextFiles(String line) throws IOException {
        String folderName = line.split("\\s+")[1];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(folderName);
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        // String line;
        //System.out.println("Print File "+f.getName()+"? y/n");
        name = br.readLine();
        if(name.equals("message")) {
            if(isTxtOrCsv(f.getName())){
                while ((line = fin.readLine()) != null) {
                    System.out.println(line);
                }
            }else {
                System.out.println("not correct");
            }
        }
    }
    public static boolean isTxtOrCsv(String correct) {
        Pattern p = Pattern.compile(".+\\.(txt|csv)");
        Matcher m = p.matcher(correct);
        return m.matches();
    }*/
