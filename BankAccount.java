public class BankAccount {

    private String name;
    private String email;
    private int id;
    private String accountType;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setId(int id){
        if (id < 10){
            this.id=11;
        }
    }
    public int getId(){
        return id;
    }
    public void setAccountType(String accountType) {

        if (accountType == "S") {
            this.accountType = "Saving Account";
        } else if (accountType == "C") {
            this.accountType = "Current Account";
        }
    }
    public String getAccountType(){
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount banInfo= new BankAccount();
        banInfo.setName("TD");
        banInfo.getName();
        banInfo.setEmail("abkuy@gamil.com");
        banInfo.getEmail();
        banInfo.setId(2);
        banInfo.getId();
        banInfo.setAccountType("S");
        banInfo.getAccountType();

        System.out.println("Bank name :"+ banInfo.getName());
        System.out.println("bank Id: "+ banInfo.getId());
        System.out.println("Email:"+ banInfo.getEmail());
        System.out.println("Account type :"+ banInfo.getAccountType());


    }



































}



