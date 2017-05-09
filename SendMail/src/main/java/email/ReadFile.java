package email;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 23.04.2017.
 */
public class ReadFile {

    private RandomAccessFile randomAccessFile;

    public ReadFile(String file) throws FileNotFoundException {
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
}
