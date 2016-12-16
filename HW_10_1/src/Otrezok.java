/*Создать объект класса Квадрат, используя классы Точка, Отрезок.
Методы: задание размеров, растяжение, сжатие, поворот, изменение цвета.*/
public class Otrezok {

    private Tochka start;
    private Tochka end;

    public Otrezok(int startX,int startY, int endX, int endY) {
        start = new Tochka(startX,startY);
        end = new Tochka(endX,endY);
    }


}

