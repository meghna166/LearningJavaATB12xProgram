package ex_13_String_Buffer_builder_Stringfunctions;

public class Lab_058_InQ_Reverse_withoutUsing_Inbuilt {
    public static void main(String[] args) {

        String input = "Meghna";

        for(int i = input.length()-1; i>=0; i--){
            System.out.println(input.charAt(i));
        }
        System.out.println("");

        StringBuffer sb = new StringBuffer(input);

        System.out.println(sb.reverse());
    }
}
