package Task;

import java.util.Scanner;
public class Reverse_Num {
    public static void main(String[] args) {
        // Reverse the number using for loop.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
int num = scanner.nextInt();

String StringLength = String.valueOf(num);
int length  = StringLength.length();

        int rev = 0;

        for(int i=1; i<= length; i++){
           int rem = num%10;
             rev = (rev*10)+rem;
            num = num/10;

        }
        System.out.println(rev);

    }
}
