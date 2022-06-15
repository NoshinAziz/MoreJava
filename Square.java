public class Square extends Shape {


String nicName;

    public Square(int l, int w, String n) {
        super(l, w);
        nicName=n;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("NickName is :"+ nicName);
    }

    @Override
    public void area() {
        super.area();
        int area=length*weight;
        System.out.println("New area is :"+ area);
    }

    public static void main(String[] args) {

        Square qua=new Square(5,5,"Sweet");
        qua.print();
        qua.area();
    }













}




