package ex_11_Functions;

public class Lab_049_UD_Part1 {
    public static void main(String[] args) {
        //User defined functions

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        wp_wr_Greet();

        String msg = wp_with_RT();
        System.out.println(msg);

        greet_with_details("Meghna",27,50000);

        int sum1 = sum(3,4);
        System.out.println(sum1);


    }

   // 1. Without Parameters and Without Return Type. (Declare) /Define

    static void wp_wr_Greet(){
        System.out.println("hi");
    }

    // 2. Without Parameters but With Return Type

    static String wp_with_RT(){
        System.out.println("hi");
        return "how are you";
    }

    //  3. With Parameters and Without Return Type ( 90%)

    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Your name is " + name + "\nYour age is " + age + "\nSalary is " + salary);
    }

    static int sum(int a, int b){
        return a+b;
    }
}
