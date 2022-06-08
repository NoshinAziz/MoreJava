public class Student {
    String name;
    String email;
 //Thats are variable.
    public Student(String n, String e) {
        name = n;
        email = e;
// valus will given by new students.
    }

    public void printInfo() {

        System.out.println("name is "+ name);
        System.out.println("email is "+ email);
    }
public void watchClassVideo( int number ){
    System.out.println(name + " watching class video: " + number);


}

    public static void main(String[] args) {
        Student noshinobj = new Student("noshin", "noshinpou@gmail.com");
        noshinobj.printInfo();

        Student maraobj = new Student("Mara ", "maraou@gmail.com");
        maraobj.printInfo();


        noshinobj.watchClassVideo( 2);
        maraobj.watchClassVideo(5);
    }

}