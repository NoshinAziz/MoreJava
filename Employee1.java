import sun.nio.cs.ext.MacArabic;

public class Employee1 {

    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;

    }

    public void setId(int id) {
        if (id > 50) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void getSalary() {
        if (salary > 10000 || salary < 5000) {

            System.out.println("It is not a good manner to ask someone's salary");
        }

        else {
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        Employee1 empInfo=new Employee1();
        empInfo.setName("noshin");
        empInfo.getName();
        empInfo.setEmail("noshinar@gmail.com");
        empInfo.getEmail();
        empInfo.setId(21);
        empInfo.getId();
        empInfo.setSalary(6000);
        empInfo.getSalary();

        System.out.println("name is :"+ empInfo.getName());
        System.out.println("email is :"+ empInfo.getEmail());
        System.out.println("Id is: "+ empInfo.getId());




    }




















}



