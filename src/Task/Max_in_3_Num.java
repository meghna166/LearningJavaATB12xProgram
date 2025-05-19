package Task;

public class Max_in_3_Num {
    public static void main(String[] args) {
        int a = 28, b = 26, c = 29;
        int Max_Num = (a > b) ? ( a > c) ? a : c: ((b > c) ? b :c);


        System.out.println(Max_Num);
    }
}
