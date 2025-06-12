package ex_09_While_Loop;

public class Lab_042_Factorial {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        int i=1;
        while(i<=num){
            factorial = factorial*i;
            i++;
        }
        System.out.println(factorial);
    }
}
