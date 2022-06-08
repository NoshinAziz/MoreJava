public class Car1 {
    private String name;
    private int number;

    public void setName(String name){
        this.name=name;

    }

    public String getName(){
        return name;
    }

    public void setNumber(int n){
        if (n <= 5){
           this.number=6;
        }
        else{
           this.number=n;

        }
    }
    public int getNumber(){
        return number;
    }

    public static void main(String[] args) {
        Car1 infoN= new Car1();
        Car1 infoN1=new Car1();

        infoN.setName("Honda");
        infoN.setNumber(7);
        infoN1.setName("Audi");
        infoN1.setNumber(4);

        System.out.println("Name is: "+ infoN.getName());
        System.out.println("Number is :"+ infoN.getNumber());
        System.out.println("Another name is :"+ infoN1.getName());
        System.out.println("Another number is :"+ infoN1.getNumber());
    }




}
