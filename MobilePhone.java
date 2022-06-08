public class MobilePhone {
    private String brandName;
    private String color;
    private int modelNo;

    public void setBrandName(String n){
        this.brandName=n;
    }
    public String getBrandName(){
        return brandName;
    }
    public void setColor(String c){
        this.color=c;
    }
    public String getColor(){
        return color;
    }
    public void setModelNo(int m){

        if (m < 25 && m >50) {

            this.modelNo=0;
        }
        else {
       this.modelNo=m;

        }

    }
public int getModelNo(){
        return modelNo;
}

    public static void main(String[] args) {
        MobilePhone myPhone= new MobilePhone();
    myPhone.setModelNo(45);
    myPhone.getModelNo();
    myPhone.setBrandName("Apple");
    myPhone.getBrandName();
    myPhone.setColor("Blue");
    myPhone.getColor();
        System.out.println("Model no:" + myPhone.getModelNo());
        System.out.println("Brand name :"+ myPhone.getBrandName());
        System.out.println("color is : "+ myPhone.getColor());



    }



}
