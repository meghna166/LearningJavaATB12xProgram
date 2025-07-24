package ex_14_Arrays;

import java.util.Arrays;

public class Lab_79_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int array[] = {192,34,1313,35,2 ,5 ,9,10 };

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println(array[array.length -2] );



    }
}
