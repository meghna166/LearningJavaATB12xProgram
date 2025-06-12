package ex_11_Functions;
import java.util.Scanner;
public class Lab_051_Arth_Functions {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a = 0;
        if(scanner.hasNextInt()){ a = scanner.nextInt();
        }
        else{
            System.out.println("Enter the number values only");
            System.exit(0);
        }

        System.out.println("Enter the num2");
        int b =0;
        if(scanner.hasNextInt()){ b = scanner.nextInt();
        }
        else{
            System.out.println("Enter the number value only");
            System.exit(0);
        }

 int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_mod);
        System.out.println(result_div);



    }

    static int sum(int a , int b){
        return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }

    static int mul(int a, int b){
        return a * b;
    }

    static int mod(int a , int b){
        return a % b;
    }

    static int div(int a , int b){
        return a / b;
    }
}
