public class ForeverYoung {
    private String name;
    private int age;
    private String message;

    public void setName(String name){
        this.name= name;

    }
    public String getName(){
        return name;
    }

 public void setMessage(String message){
        this.message=message;
 }
 public String getMessage(){
        return message;
 }

    public void setAge(int a){
    this.age=a;


    }
        public void getAge(){
          if (age >18){
              System.out.println("Age is just number");

        }
          else {
              System.out.println(age);
          }
    }








    public static void main(String[] args) {
        ForeverYoung myYoung= new ForeverYoung();
        myYoung.setAge(20);
        myYoung.getAge();

    }
}
