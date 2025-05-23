package Practise;

public class ex_12_Print_Num_Pattern {
    public static void main(String[] args) {
        //Print a pattern of numbers like:
        //1
        //12
        //123
        //1234
        for(int i =1 ; i<=5  ; i++){

            for(int j =1 ; j <=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
