public class Shape {
    int length;
    int weight;

    public Shape(int l, int w){
        length=l;
        weight=w;
    }

    public void area(){
        System.out.println("i am calculating");
    }

    public void print(){
        System.out.println("length is :" + length);
        System.out.println("weight is :"+ weight);
    }

}
