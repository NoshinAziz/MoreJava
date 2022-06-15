public class Member {
    String Name;
    int Age;
    String PhoneNumber;
    String Address;
    int Salary;
public Member(String n, int a, String p, String ad, int s, String d, String da, int i){
     Name= n;
    Age=a;
    PhoneNumber=p;
    Address=ad;
    Salary=s;


}

public void printSalary(int s){
    System.out.println("salary of the :"+ Salary);
}
}

