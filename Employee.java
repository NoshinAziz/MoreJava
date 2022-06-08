public class Employee {
    String name;
    String  password;
    public Employee(String n, String p){
        name= n;
        password=p;

    }
    public void printInfo(){
        System.out.println("Name is :"+ name);
        System.out.println("Password is :"+ password);
    }
    public void WatchClassVideo(int number){
        System.out.println(name + " " + "Watch class video : "+ number);

    }
    public void submitAssignment(int number){
        System.out.println(name + " " + "want to submits assignment " + number);

    }

}
