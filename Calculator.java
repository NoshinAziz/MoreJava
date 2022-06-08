public class Calculator {

    public static int add(int a, int b){
        int result = a + b;

        System.out.println("Added value: "+ result);
        System.out.println("Print add value");
        return result;
    }
    public static int deduct(int a, int b){

        int result= a-b;
        System.out.println("deduct value :"+ result);
        return result;
    }




    public static void main(String[] args) {
        add(500,600);
        deduct(500,600);
    }
}
