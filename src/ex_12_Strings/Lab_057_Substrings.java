package ex_12_Strings;

public class Lab_057_Substrings {
    public static void main(String[] args) {
        String s1 = "Meghna Bansal";
        System.out.println(s1.substring(6));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.substring(1,3));


        System.out.println(s1.subSequence(2,5));

        String s2 = "   Computer".trim();
        System.out.println(s2);

        System.out.println(s2.repeat(2));

    }
}
