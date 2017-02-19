import DMDSoft_Solutions.Factory;

import java.io.*;

/**
 * Created by Дмитрий on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
   /*     OutputStream out =new FileOutputStream("file233.txt");

        out.write("Hello World!".getBytes());//принимает массив айтов

        out.close();
    }
    //--------------------------------------------------------
*/
      /*  String fileName="file233.txt";
        String fileData=readFromFile(fileName);
        System.out.println(fileData);

        writeToFile(fileData,"output.txt");
    }
    //
    public static String readFromFile(String fileName) throws IOException {
        InputStream input = new FileInputStream(fileName);//принимает либо файл либо путь к файлу он открівает входящий поток и из него считівает информацию
        StringBuilder result = new StringBuilder();
        int data; //vorvrashaen -1 0 1 pri vichetko texta
        while ((data=input.read()) >=0){ //считіваем информацию и добавляем её в файл
            result.append((char) data);// kontatenacia texta
        }
        input.close();
        return result.toString();
    }

    public static void writeToFile(String data,String fileName) throws IOException {
        Writer out=new FileWriter(fileName); // принимает строку и записівает
        out.write(data.toUpperCase());
        out.close();
    }*/

 /*       //___________________________________
        String fileName = "file233.txt";
        String fileData = readFromFile(fileName);
        System.out.println(fileData);
        writeToFile(fileData,"output.txt");
    }

    public static String readFromFile(String fileName) {
        StringBuilder result = new StringBuilder();
        int data;

        try (InputStream input = new FileInputStream(fileName)) {

            while ((data = input.read()) >= 0)
                result.append((char) data);

            } catch(IOException e){
                e.printStackTrace();
            }
            return result.toString();
        }


    public static void writeToFile(String data,String fileName)   {

        try (Writer out=new FileWriter(fileName)) {

            out.write(data.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
        Factory DMDSoft_Solutions = new Factory("DMDSoft_Solutions");
        DMDSoft_Solutions.add("DEVELOPER",0,"Kuzmenko","Dmitriy",1900);
        DMDSoft_Solutions.add("DEVELOPER",1,"Petrov","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",0,"Petrov","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",1,"Ivanod","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",2,"Petrov2","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",3,"Ivanod2","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",4,"Petrov3","Ivan",900);
        DMDSoft_Solutions.getAll();
        DMDSoft_Solutions.get("DEVELOPER",0);
        DMDSoft_Solutions.getis("DEVELOPER");
    }
    }

