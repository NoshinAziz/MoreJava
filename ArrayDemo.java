public class ArrayDemo {
    //Array means multiple item.
    // String[] args= {"noshin", "Rahman"}

    public static void main(String[] args) {

        //building an array variable to store multiple integer type of data
        int[] studentId ={101,102,103,104};
        studentId[3] =103;
        System.out.println(studentId[3]);


        String [] studentGrade= new String[5];

        studentGrade [0]= "A";
        studentGrade[1] ="C";

        System.out.println(studentGrade[1]);

        String argsValue0= args[0];
        String argsValue1= args[1];
        System.out.println("My full name :"+ argsValue0 + " " + argsValue1);


    }
}
