import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Дмитрий on 19.02.2017.
 */
public class test {
    //+++++++++++++++++++++++++++++++++++
   /* import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


import static java.nio.file.Paths.get;

    public class Main {
        public static void main(String[] args) throws IOException {
            // out.println(new String(readAllBytes(get("form.txt"))));

            //System.out.println(new String(Files.readAllBytes(Paths.get("form.txt"))));

            String fileName = "form.txt";


       *//* String result2;
        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            System.out.println(line);
        }*//*


            String fileData = readFromFile(fileName);
            System.out.println(fileData);


        }
        public static String readFromFile(String fileName) {
            StringBuilder result = new StringBuilder();
            int data;

            try (InputStream input = new FileInputStream(fileName)) {

                while ((data = input.read()) >= 0)
                    result.append((char) data);

            } catch (IOException e) {
                e.printStackTrace();
            }
            return result.toString();
        }
    }*/

    //++++++++++++++++++++++++++++++++++

}
