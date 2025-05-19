package ex_03_Operators;

public class Lab_020_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean c = true || false; // OR - output is true if at least one output is true
        System.out.println(c);

        boolean d = true && true; // AND - output is true only if both are true
        System.out.println(d);

    }
}
