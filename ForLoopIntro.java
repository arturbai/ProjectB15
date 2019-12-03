package day18;

import java.util.Scanner;

public class ForLoopIntro {
    public static void main(String[] args) {
        // count 1 to 5
        for(int x =1; x<=5;++x){
            System.out.println("number: "+x);
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter #");
        for(int y = scan.nextInt(); y<=122; y+=39 ){
            System.out.println("count to: "+y);
        }
        for(int counter = 5; counter>0; counter--){
            System.out.println("counter = " + counter);
        }
    }
}
