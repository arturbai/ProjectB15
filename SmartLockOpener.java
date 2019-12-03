package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {
        /* smart lock door has a password, unless you enter the correct password
        *  it keeps asking you for the password and assuming correct password is B15
        *  keep asking until user will enter the correct password
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Knock Knock!!");
        System.out.println("Please enter the password");
        // entering password for the first time
        String password = scan.next();
        while ( ! password.equals("B15")){
            System.out.println("Wrong password, please trying again");
            password = scan.next();
        }
        System.out.println("Shazam is opened");
    }
}
