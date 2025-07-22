package ex_14_Arrays;

public class Lab_066_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int [] Marks = {91, 90, 53, 34, 60,70};
        boolean [] is_married_people = {true, false, true};

        System.out.println(Marks.length);
        System.out.println(Marks[1]);
        System.out.println(Marks[3]);

      //  System.out.println(Marks[-1]);

        char c = 'A';

        String name = "Meghna";

        String[] alphabet_in_name = name.split("");

        //Print each character of array
        for(String ch : alphabet_in_name){
            System.out.println(ch);
        }

    }
}
