package day18;

import java.util.Scanner;

public class GiveMe$5or$20 {
    public static void main(String[] args) {
        //keep asking for $5 or $20 until get them
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 or 20, please");
        int x = scan.nextInt();
            // or !(x==5 || x==20) or (x==5 || x==20) - also true
        while(!(x==5 || x==20))
        //(x!=5 && x!=20)
        {
            System.out.println("Not the Bill I AM Looking for");
            System.out.println("Give me 5 or 20 bill");
            x = scan.nextInt();
        }
        System.out.println("The Happy Ending!! Got the money!!");
    }
}
