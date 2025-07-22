package ex_14_Arrays;

public class Lab_070_Arrays_Max_Min {
    public static void main(String[] args) {
        int [] array = {2,3,4,45,23,5,23,99};

        int max = array[0];
        int min = array[0];

        //logic
        for( int i =0; i< array.length; i++){
            if(array[i]>max){
                max= array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);
    }
}
