public class AList {
    private int initialSize;
    private int size=0;
    private float maxLoad=0.8f;
    private float minLoad=0.6f;
    private int[]array;
    private static final int MIN_SIZE=10;


    public AList() {
        this.initialSize=10;
        this.array=new int[initialSize];
        // при создании нового єкземляра у нас создается массив
        // на 10 єлементов и укажем ему капасити 10
    }

    public AList(int initialSize) {
        this.initialSize = initialSize;
        this.array=new int[initialSize];
    }

    public int size(){
        return  size; //getter тоже самое что и гетсайз
    }

    public void add(int n){
        float currentLoad=size/(initialSize*1.0f);
        if(currentLoad>=maxLoad){
            initialSize=(int)(size*1.5);
            int[]tmp=new int[initialSize];

            for(int i=0; i<size;i++){
                tmp[i]=array[i];
            }
            array = tmp;
        }
        array[size++]=n;
    }

    public void remove(){
        if(size>0) {
            array[--size ] = 0;//udalili odin element
        }
        float currentLoad=size/initialSize;
        if(currentLoad<=minLoad&&array.length>MIN_SIZE){
            initialSize=(int)(size*1.5);
            int[]tmp=new int[initialSize];
            for(int i=0; i<size;i++){
                tmp[i]=array[i];
            }
            array=tmp;
        }
    }
    public int get(int index){
        if(index<=0 ||index>=size) throw new IllegalArgumentException();//peredaem owibku v metod kotoriu nas vizval.saozdaem object owibki
        return array[index];
    }

    public int getArrayLenght(){
        return array.length;
    }
}
