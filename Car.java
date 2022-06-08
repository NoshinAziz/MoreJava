public class Car {
    public void pressBreak(int breakPaddleTravel){
        System.out.println("Press break to:"+breakPaddleTravel + "%");
    }
public static void startCar(){
    System.out.println("car Started, lets drive!!!");
}




    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.pressBreak( 20 );
        startCar();

        Light myLight = new Light();
        myLight.turnOnLight();
        myLight.turnOffLight();
        myLight.reduceOfBrightness(50);

        String time= "SunnyDay";
        if (time == "SunnyDay"){
            System.out.println("Do not turn on light");
            myLight.turnOffLight();
        }
        else if (time == "CloudyDay"){
            System.out.println("Adjust the light");
            myLight.reduceOfBrightness(50);
        }
    else if (time == "NightTime"){
            System.out.println("Turn on");
            myLight.turnOnLight();
        }
    }
}
