package Practise;

public class ex_12_SumOfDigit {
    public static void main(String[] args) {
        int num = 1234;
        int result = 0;
        int sum = 0;
        while(num!=0){
            result = num % 10;
            sum = result+ sum;
            num = num / 10;

        }
        System.out.println(sum);

    }
}
