public class Triangle extends Shape1{
    @Override
    public void area() {
        System.out.println("Area of triangle");

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of triangle ");
    }

    public static void main(String[] args) {
        Triangle  t=new Triangle();
        t.area();
        t.perimeter();

    }
}
