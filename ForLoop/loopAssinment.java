package ForLoop;

public class loopAssinment {
public void printStringArray() {
    String[] subjects = {"math", "computer science", "history", "geography"};
    int i;
    for (i = 0; i <= 3; i++) {
        ;
        System.out.println(subjects[i]);


    }
}
    public void printIntegarArray(){
        int[] numbers={3,7,9,4,2};
        int i;
        for (i=0; i<=4; i++) {
            ;
            System.out.println(numbers[i]);


        }
    }

    public void printCharArray(){
        char[] alphabets={'a','c','e'};
        int i;
        for (i=0; i<=2; i++) {
            ;
            System.out.println(alphabets[i]);


        }
    }
    public void printStringArray2() {
        String[] subjects = {"math", "computer science", "history", "geography"};
        for (String i : subjects) {
            System.out.println(i);
        }


    }
    public void printIntegarArray2(){
        int [] numbers={3,7,9,4,2};
        for (int i : numbers){
            System.out.println(i);
        }
    }
    public void printChararray2() {
        char[] alphabets = {'a', 'c', 'e'};
        for (char i : alphabets) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
    loopAssinment l=new loopAssinment();
    l.printStringArray();
    loop2 l2= new loop2();
    l2.printIntegarArray();
    loop3 l3= new loop3();
    l3.printCharArray();
    foreachLoop el= new foreachLoop();
    el.printStringArray2();
    foreachLoop2 el2=new foreachLoop2();
    el2.printIntegarArray2();
    foreachLoop3 el3= new foreachLoop3();
    el3.printChararray2();

    }
}
