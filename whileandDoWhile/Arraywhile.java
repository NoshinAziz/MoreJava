package whileandDoWhile;

public class Arraywhile extends WhileDoWhile{

    String[] subjects={"math","computer science","history","geography"};
    int [] numbers={3,7,9,4,2};
    char[]  alphabets={'a','c','e'};


    @Override
    public void printStringArray() {
        int i = 0;
        while (i < subjects.length) {
            System.out.println(subjects[i]);
            i++;
        }
    }

    @Override
    public void printIntegarArray() {

    }

    @Override
    public void printCharArray() {

    }

    @Override
    public void searchStringArray(String word) {

    }

    @Override
    public void searchIntegarArray(String number) {

    }

    @Override
    public void searchCharArray(String letter) {

    }

    public void printVowels(String[] vowelarray) {
        int i = 0;
        while (i < vowelarray.length) {
            System.out.println(vowelarray[i]);
            i++;

        }
    }




    public static void main(String[] args) {
        String[] vowelArray={"a","e","i","o","u"};
        Arraywhile aw= new Arraywhile();
        aw.printVowels(vowelArray);

    }


}
