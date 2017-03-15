package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = {0, 2, 2, 9, 9, 6, 3, 2, 8, 8, 9, 0};
        File file = new File("Arr.yaml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

      //  writeFiles(array,file);
        System.out.println(findArray(file,"ArrayD"));
    }

    public static int searchValues(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            int num = array[i];
            for (int k = 0; k < array.length; k++)
                if (array[k] == num)
                    count++;
            if (count == 1) {
                // нашли число
                result = num;
                break;
            }

        }
        return result;
    }
////////////////////
    public static void writeFiles(int[]array, File file) throws IOException {
        RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
        randomAccessFile.seek(file.length());
//
        randomAccessFile.write("Array: ".getBytes());
        StringBuilder builder=new StringBuilder();

        for (int i=0;i<array.length;i++){
            if (i==0) builder.append("[");
            builder.append(array[i]);
            if (i!=array.length-1) builder.append(", ");
            if (i==array.length-1) builder.append("]");
        }
        randomAccessFile.writeBytes(builder.toString());
    }

    public static int findArray (File file, String nameArray) throws IOException {
        RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
        randomAccessFile.seek(0);

        int startIndex;
        int endIndex;
        int result[] = null;

        String str;
        while ((str=randomAccessFile.readLine())!=null){
            if (str.startsWith(nameArray+":")){
                str=str.replaceAll(" ","");
                startIndex=str.indexOf("[")+1;
                endIndex=str.indexOf("]");
                String[] split=str.substring(startIndex,endIndex).split(",");
                result=new int[split.length];
                for (int i=0;i<split.length;i++){
                    result[i]= Integer.parseInt(split[i]);
                }
            }
        }

        return searchValues(result);

    }

    public static int testTestov(int[] array) {
//
        int[] x = new int[11];
        x[0] = 2;
        x[1] = 10;
        x[2] = 2;
        x[3] = 9;
        x[4] = 10;
        x[5] = 9;
        x[6] = 11;
        x[7] = 4;
        x[8] = 5;
        x[9] = 11;
        x[10] = 4;

        int z = 0;
        int k = 0;
        while (k < x.length) {
            z = z ^ x[k];
            k++;
        }
        System.out.println(z);
        return z;
    }
}


