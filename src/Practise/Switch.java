package Practise;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Days of week
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday, #Yay last working day");
                break;
            case 6:
                System.out.println("Saturday, #WEEKEND");
                break;
            case 7:
                System.out.println("Sunday, #WEEKEND");
                break;
            default:
                System.out.println("OOPS, Invalid number");
        }

    }
}
