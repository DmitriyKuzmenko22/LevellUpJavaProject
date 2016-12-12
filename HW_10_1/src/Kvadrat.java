/*Создать объект класса Квадрат, используя классы Точка, Отрезок.
Методы: задание размеров, растяжение, сжатие, поворот, изменение цвета.*/
public class Kvadrat {

    private int lenght;
    private int width;
    private String color;
    Otrezok otrezok1;
    Otrezok otrezok2;
    Otrezok otrezok3;
    Otrezok otrezok4;

    public Kvadrat(int lenght, int width, String color) {
        this.lenght = lenght;
        this.width = width;
        this.color = color;
        otrezok1=new Otrezok(0,0,lenght,0);
        otrezok2=new Otrezok(0,0,0,width);
        otrezok3=new Otrezok(0,width,lenght,width);
        otrezok4=new Otrezok(lenght,width,lenght,0);

    }


}
