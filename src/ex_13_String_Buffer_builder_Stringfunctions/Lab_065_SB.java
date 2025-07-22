package ex_13_String_Buffer_builder_Stringfunctions;

public class Lab_065_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("programming");
        System.out.println(sb);
        sb.replace(2,6,"meg");
        System.out.println(sb);
    }
}
