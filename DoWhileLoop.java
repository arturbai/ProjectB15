package day18;

public class DoWhileLoop {
    public static void main(String[] args) {
        // count from 1 to 5 ;
//        do {
//            take some action here and repeat it
//        } while (some condition is true) ;
        int x = 1;
        do {
            System.out.println("number: " + x);
            ++x;
        } while (x <= 5); //semi colon is mandatory

        int y = 5;
        do{
            System.out.println(y);
            --y;
        }while (y>0);



    }
}
