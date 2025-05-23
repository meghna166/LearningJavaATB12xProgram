package Practise;

public class ex_10_Loops_Fibonnaci {
    public static void main(String[] args) {
        int a=0 ;
        int b =1;

        for(int i =0; i<=10; i++){
            System.out.println(a + "");

            int c = b+a;

            a=b;
            b=c;

        }

    }
}
