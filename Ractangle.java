import java.awt.*;

public class Ractangle extends Shape{

   String color;
    public Ractangle(int l, int w, String C) {
        super(l, w);
        color=C;

    }


    @Override
    public void print() {
        super.print();
        System.out.println("color of the Shape is :"+ color);
    }

    @Override
    public void area() {
        super.area();
        int answer=length*weight;
        System.out.println("Final ans of the area is :"+ answer);

    }


    public static void main(String[] args) {

        Ractangle ang=new Ractangle(6,4,"Black");
        ang.print();
        ang.area();
        



    }






}


