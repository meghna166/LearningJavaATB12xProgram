package Task;

import java.util.Scanner;
public class Month_LeapYr {
    public static void main(String[] args) {
        //Write a Java program that takes a month number (1-12) and prints the number of days in that month using a switch statement. Handle February separately for leap years.
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter month number");
        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();
            System.out.println("Enter Year");
            int year = scanner.nextInt();

            String Month = switch (month) {
                case 1 -> "Jan-31";
                case 2 -> {
                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                        yield "Feb-29";
                    } else {
                        yield "Feb-28";
                    }
                }

                case 3 -> "March-31";
                case 4 -> "April-30";
                case 5 -> "May-31";
                case 6 -> "june-30";
                case 7 -> "July-31";
                case 8 -> "Aug-31";
                case 9 -> "Sep-30";
                case 10 -> "Oct-31";
                case 11 -> "Nov-30";
                case 12 -> "Dec-31";
                default -> "invalid month";

            };
            System.out.println(Month);

        }
        else{
            System.out.println("Enter Numeric value only");
        }



    }
}
