package Entities;

public class Retangle {

    public double widht;
    public double height;

    public double area(){
        return widht*height;
    }
    public double perimeter(){
        return 2 * (widht+height);
    }
    public double diagonal(){
        return Math.sqrt(widht * widht + height * height);
    }


}
