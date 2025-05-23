package Practise;

public class ex_06_Loops_Inverted_Triangle {
    public static void main(String[] args) {
        //Print inverted traingle pattern:
        for(int i=5; i>=1; i--){
            for(int j =i; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
