package ex_14_Arrays;

public class Lab_078_Sum_of_Array {
    public static void main(String[] args) {
        int array[] = {2,3,4};

        int sum =0;

        for(int i =0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
