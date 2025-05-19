package ex_03_Operators;

public class Lab_021_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Meghna";
        String second_name = "Bansal";

        int a = 10;
        int b = 20;

        System.out.println(first_name + second_name + a +b); // MeghnaBansal1020

        System.out.println(b + a + second_name + first_name); // 30BansalMeghna

        System.out.println(first_name + second_name + (a+b)); // MeghnaBansal30

        System.out.println(!(10>20));
    }
}
