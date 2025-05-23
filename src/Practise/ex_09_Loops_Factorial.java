package Practise;

public class ex_09_Loops_Factorial {
    public static void main(String[] args) {
        //Print the factorial of a given number (e.g., 5! = 120).
int n = 5;
        int result = 1;
     for(int i = 1; i<=n ; i++){

         result = result * i;


     }
        System.out.println(result);
    }
}
