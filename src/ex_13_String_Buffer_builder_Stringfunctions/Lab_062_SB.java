package ex_13_String_Buffer_builder_Stringfunctions;

public class Lab_062_SB {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Meghna");
        stringBuffer.append("Bansal");
        System.out.println(stringBuffer);

        String s1 = "Meghna";
        s1 = s1+ "Bansal";

        System.out.println(s1);
    }
}
