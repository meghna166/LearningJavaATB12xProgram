package Practise;

public class ex_11_ReverseOfNo {
    public static void main(String[] args) {
        //Print the reverse of a given number.
        int rev = 0;
        int number = 6789;
        while(number !=0){
            int rem = number%10;
            rev = (rev*10)+rem;
            number = number/10;
        }
        System.out.println(rev);
    }
}
