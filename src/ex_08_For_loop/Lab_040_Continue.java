package ex_08_For_loop;

public class Lab_040_Continue {
    public static void main(String[] args) {
        for(int i =1; i<=50;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
