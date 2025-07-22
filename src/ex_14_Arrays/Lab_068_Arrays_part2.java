package ex_14_Arrays;

public class Lab_068_Arrays_part2 {
    public static void main(String[] args) {
        String[] names = {"meghna", "pooja" , "priya"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] name = new String[3];
        name[0] = "hi";
        name[1] = "hello";
        name[2] = "hey";

        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);

        boolean[] is_male = new boolean[2];
        is_male[0] = true;
        is_male[1] = false;

        System.out.println(is_male[1]);
    }
}
