package ex_11_Functions;
import java.util.Scanner;
public class Lab_051_Arth_Functions {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter the num1: ");
        int b = readInt(scanner, "Enter the num2: ");

        int r_sum = sum(a,b);
        System.out.println(r_sum);







    }

    static int sum(int a,int b){
        return a+b;
    }
}
