package ex_13_String_Buffer_builder_Stringfunctions;

import java.sql.SQLOutput;

public class Lab_061_StringBuilder_vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Meghna";
        String s1 = new String("Meghna");

        StringBuffer SF = new StringBuffer("Meghna");
        StringBuilder SB = new StringBuilder("Meghna");

        System.out.println(SF);
        System.out.println(SB);

        System.out.println(SF.reverse());
        System.out.println(SB.reverse());

    }

}
