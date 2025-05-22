package Practise;

import java.util.Scanner;
public class Ex_02_ScannerClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //User Profile
        System.out.println("Enter your Name");
        String name = scanner.nextLine();

        System.out.println("Enter Age");
        int age = scanner.nextByte();

        System.out.println("Enter your Mobile Number");
        long number = scanner.nextLong();


    }

}
