package Practise;

public class ex_08_Loops {
    public static void main(String[] args) {
        //Print the sum of even numbers from 1 to 50.
      int  sum = 0;

        for(int i =1; i<=50; i++){
            boolean even = (i%2==0);
            if(even){
                sum = sum +i;
            }


        }
        System.out.println(sum);
    }
}
