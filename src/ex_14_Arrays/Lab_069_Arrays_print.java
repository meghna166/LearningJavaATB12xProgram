package ex_14_Arrays;

public class Lab_069_Arrays_print {
    public static void main(String[] args) {
        int[] marks = {12,23,34,45,54,23,45};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);

        System.out.println("-----");

        for(int i =0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        System.out.println("--Enhanced for loop--");

        for(int ch: marks){
            System.out.println(ch);
        }
    }
}
