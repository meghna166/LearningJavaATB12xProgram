package ex_11_Functions;

public class Lab_048_User_Defined {
    public static void main(String[] args) {
int r1 = sum_of_two_num(4,5);
int r2 = sum_of_two_num(7,8);

        System.out.println(r1);
        System.out.println(r2);

    }

    static int sum_of_two_num(int a, int b){
return a+b;
    }
}
