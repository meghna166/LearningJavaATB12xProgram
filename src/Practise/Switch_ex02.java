package Practise;

import java.util.Scanner;

public class Switch_ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter month number (1-12)");
        int Month_Number = scanner.nextInt();

        switch(Month_Number){
            case 1:
                System.out.println("January");
                System.out.println("31");
                break;
            case 2:
                System.out.println("February");
                System.out.println("28");
                break;
            case 3:
                System.out.println("March");
                System.out.println("31");
                break;
            case 4:
                System.out.println("April");
                System.out.println("30");
                break;
            case 5:
                System.out.println("May");
                System.out.println("31");
                break;
            case 6:
                System.out.println("June");
                System.out.println("30");
                break;
            case 7:
                System.out.println("July");
                System.out.println("31");
                break;
            case 8:
                System.out.println("August");
                System.out.println("31");
                break;
            case 9:
                System.out.println("September");
                System.out.println("30");
                break;
            case 10:
                System.out.println("October");
                System.out.println("31");
                break;
            case 11:
                System.out.println("November");
                System.out.println("30");
                break;
            case 12:
                System.out.println("December");
                System.out.println("31");
                break;
            default:
                System.out.println("Enter valid Number");
        }

    }

}
