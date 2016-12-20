package com.company;

public class AList {

    private int initialSize;//начальный размер
    private int size = 0;
    private float maxLoad = 0.8f;
    private float minLoad = 0.6f;
    private int[] array;
    private static final int MIN_SIZE = 20;

    public AList() {
        this.initialSize = 10;
        this.array = new int[initialSize];
    }

    public AList(int initialSize) {
        this.initialSize = initialSize;
        this.array = new int[initialSize];
    }

    public int size() {

        return size;
    }

    public void add(int n) {
        float currentLoad = size / (initialSize * 1.0f);
        if (currentLoad >= maxLoad) {
            initialSize = (int) (size * 1.5);
            int[] tmp = new int[initialSize];

            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[size++] = n;
    }

    public void remove() {
        if (size > 0) {
            array[--size] = 0;//array[size-1] =0
        }
        float currentLoad = size / initialSize;
        if (currentLoad <= minLoad && array.length > MIN_SIZE) {
            initialSize = (int) (size * 1.5);
            int[] tmp = new int[initialSize];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
    }

    public int get(int index) {
        if (index < 0 || index > size) throw new IllegalArgumentException();
        return array[index];
    }

    public int getArrayLength() {

        return array.length;
    }
    /*Расширить функциональность динамического списка методами:
добавления/удаления элемента из начала списка
добавления/удаления элемента из середины списка (по индексу), при этом в случае добавления элемента по индексу
который уже занят другим значением, делать вставку нового элемента смещая все последующие элементы списка
на одну позицию в конец массива, а в случае удаления - смещать все элементы в начало списка
получение индекса элемента по значению (indexOf), в случае если элемент был не найден возвращать значение -1
метод, который принимает разделитель и возвращает все элементы списка через разделитель в виде строки*/
    public int sortArrUbivanie(){
        int counter=0;
        for(int i=size;i>0;i--){
            for(int j=i; j>0 && array[j+1]>array[j];j--){
                counter++;
                int tmp=array[j+1];
                array[j+1]=array[j];
                array[j]=tmp;
            }
        } return counter;
    }


    public int sortArr(){
        int counter=0;
        for(int i=1;i<size;i++){
            for(int j=i; j>0 && array[j-1]>array[j];j--){
                counter++;
                int tmp=array[j-1];
                array[j-1]=array[j];
                array[j]=tmp;

            }
        } return counter;
    }

    public String addRazdelenieElemen(String razdel){
        String x=" ";
        for(int i=0;i<size;i++){
         x+=array[i];
            if(i<size){
                x +=razdel+" ";

            }
        } return x;
    }

//получение элемента по индексу
    public int indexOf(int elem) {
        for (int i = 0; i <size; i++) {
            if (array[i] == elem){
                return i;}
        }
        return -1;
    }

    //добавляем элемент по индексу, последующие перносим перевед
    public void addElemontForIndex(int x,int index){
        int buff;
        if(index>=size) throw new IllegalArgumentException();
        else {
            add(x);
            buff=array[size-1];
            for(int i=size; i>index;i--){
                array[i]=array[i-1];
            }
            array[index]=buff;
        }
    }

    //удаляем элемент по индексу
    public void removeToIndex(int index){
        int buff=0;
        if(index>=size) throw new IllegalArgumentException();
        else {
            buff=array[index];
            for(int i=index; i<size; i++){
                array[i]=array[i+1];
            }
            array[size-1]=buff;
            remove();
            }
            }


//добавление элемента в начало списка
    public void addFirstElemnt(int a) {
        add(a);
        int novoeChislo = array[size - 1];

        for (int i = size - 1; i > 0; i--) {
            array[i] = array[i - 1];

        }
        array[0] = novoeChislo;
    }

//удаление элемента из начала списка
    public void removeFirstElemnt() {

        for (int i = 0; i <size; i++) {
            array[i] = array[i + 1];

        }
        remove();


    }


//
//    public void addToArrayStarting(int n){
//        add(n);
//        int buffer = array[size-1];
//        for (int i = size-1; i > 0; i--){
//            array[i]= array[i-1];
//        }
//        array[0] = buffer;
//    }

}