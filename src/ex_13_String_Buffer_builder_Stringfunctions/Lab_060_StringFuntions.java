package ex_13_String_Buffer_builder_Stringfunctions;

public class Lab_060_StringFuntions {
    public static void main(String[] args) {
        String name = "meghna";

        System.out.println(name.length());
        System.out.println(name.charAt(5));

        System.out.println(name.concat(" Bansal"));

        System.out.println(name.contains("gh"));

        System.out.println(name.equals("Meghna"));

        System.out.println(name.equalsIgnoreCase("Meghna"));

        System.out.println(name.indexOf('h'));

        String s1 = "ayushi";
// Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(name.indexOf('u'));




    }
}
