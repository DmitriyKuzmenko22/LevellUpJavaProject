/*Создать объект класса Звездная система, используя классы Планета, Звезда, Луна. Методы: вывести на консоль
количество планет в звездной системе, название звезды, добавление планеты в систему.
 */
public class Planet {

    public String p1="Марс";
    public String p2="Юпитер";
    public String p3="Земля";
    public String p4="Нептун";
    public String p5="Венера";
    public String p6="Сатурн";
    public Planet(){

    }

    public Planet(String p1, String p2, String p3, String p4, String p5, String p6) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        this.p6 = p6;
    }
public int Kolich() {
    String[] arr = new String[15];
    arr[0] = p1;
    arr[1] = p2;
    arr[2] = p3;
    arr[3] = p4;
    arr[4] = p5;
    arr[5] = p6;

    int kol =0;

    for (int i=0; i<arr.length;i++){
        if(arr[i]!=null){
            kol++;
        }

    }
    System.out.println(kol);
    return kol;
}

    @Override
    public String toString() {
        return "Planet{" +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3='" + p3 + '\'' +
                ", p4='" + p4 + '\'' +
                ", p5='" + p5 + '\'' +
                ", p6='" + p6 + '\'' +
                '}';
    }
}
