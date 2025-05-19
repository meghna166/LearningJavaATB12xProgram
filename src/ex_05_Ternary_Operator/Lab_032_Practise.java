package ex_05_Ternary_Operator;

public class Lab_032_Practise {
    public static void main(String[] args) {
        //Use nested ternary to classify a number as positive, negative, or zero.

        int a = 0;

        String result = (a>0) ? "Positive" : (a<0) ? "Negative" : "zero";

        System.out.println(result);

    }
}
