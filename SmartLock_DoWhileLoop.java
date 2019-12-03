package day18;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SmartLock_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Knock, knock");

        String password;
        do{
            System.out.println("Please enter the password");
            password = scan.next();
        }while( ! password.equals("B15"));
        System.out.println("Welcome home");
    }

}

