package ua.dp.levellup.model;

/**
 * Created by java on 11.11.2016.
 */
public class Square extends Shape {
    double side;
Square(){

}
 Square(double side){
     this("Black", side);
 }
Square(String color, double side){
    this.color=color;
    this.side=side;
}
    double getPerimetr() {
        return side * 4;
    }


}
