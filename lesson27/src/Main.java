import java.io.*;

public class Main {
//___________________________________________________________
    public static void main(String[] args) throws IOException {
//        OutputStream out =new FileOutputStream("file23.txt");
//
//        out.write("Hello World!".getBytes());//принимает массив айтов
//
//        out.close();
        String fileName="input.txt";
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
    }
    //_________________________________________________________
  //  public static void main(String[] args) throws IOException {
//        OutputStream out =new FileOutputStream("file23.txt");
//
//        out.write("Hello World!".getBytes());//принимает массив байтов
//
//        out.close();
//        String fileName="input.txt";
//        String fileData=readFromFile(fileName);
//        System.out.println(fileData);
//
//        writeToFile(fileData,"output.txt");
//    }

//    public static String readFromFile(String fileName) throws IOException {
//        InputStream input = new FileInputStream(fileName);//принимает либо файл либо путь к файлу он открівает входящий поток и из него считівает информацию
//        StringBuilder result = new StringBuilder();
//        int data; //vorvrashaen -1 0 1 pri vichetko texta
//        while ((data=input.read()) >=0){ //считіваем информацию и добавляем её в файл
//            result.append((char) data);// kontatenacia texta
//        }
//        input.close();
//        return result.toString();
//    }
//
//    public static void writeToFile(String data,String fileName) throws IOException {
//        Writer out=new FileWriter(fileName); // принимает строку и записівает
//        out.write(data.toUpperCase());
//        out.close();
//    }
    //===================================================================== try catch с ресурсами
//__________________________________________________
//    public static void main(String[] args)  {

/*
    public static String readFromFile(String fileName) {
        StringBuilder result = new StringBuilder();
        int data;

        try (InputStream input = new FileInputStream(fileName);) {

            while ((data = input.read()) >= 0)
                result.append((char) data);

            } catch(IOException e){
                e.printStackTrace();
            }
            return result.toString();
        }


    public static void writeToFile(String data,String fileName)   {

        try (Writer out=new FileWriter(fileName);) {

            out.write(data.toUpperCase());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}
