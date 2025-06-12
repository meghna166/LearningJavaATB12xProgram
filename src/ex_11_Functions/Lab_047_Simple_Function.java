package ex_11_Functions;

public class Lab_047_Simple_Function {
    public static void main(String[] args) {
        //no return type or void does not return any
        non_return_type();
      String a =  return_type();
        System.out.println(a);

    }

    static void non_return_type(){
        System.out.println("Non return type");
    }

    static String return_type(){
        System.out.println("Hi");
        return "Meghna";
    }


}
