public class ForLoop3 {
    public void searchElement() {
        String[] color = {"red", "pink", "orange", "black", "blue"};
        for (int i = 0; i < color.length; i++) {
            if (color[i] == "pink") {
                System.out.println("it is there");
            } else {
                System.out.println("it is not there");
            }
            int i1 = 0;

            while (i1 < color.length) {


                if (color[i] == "pink") {
                    System.out.println("it is there");
                } else {
                    System.out.println("it is not there");
                }

                i++;
            }

        }
    }

        public static void main (String[]args){
            ForLoop3 myLoop = new ForLoop3();
            myLoop.searchElement();


        }
    }

