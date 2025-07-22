package ex_14_Arrays;
import java.util.Scanner;

public class Lab_071_Array_UserInputs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();

        String[] number = new String[size];

        for(int i =0; i< number.length; i++){
            System.out.println("Enter element " + i);
            number[i] = scanner.next();
        }

        System.out.println("-- values are --");

        for(String ch : number){
            System.out.println(ch);
        }

    }
}
