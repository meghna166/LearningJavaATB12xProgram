package ex_14_Arrays;

public class Lab_072_Array_Reverse {
    public static void main(String[] args) {
        int num[] = {2,5,2,4,5,3};
        System.out.println(num.length);
        for(int i=num.length-1; i>=0; i-- ){
            System.out.println(num[i]);
        }
    }
}
