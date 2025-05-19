package Task;

public class Age_Classification {
    public static void main(String[] args) {
        int age = 45;
       String classification =(age > 65) ? "Senior"
               : (age >= 18) ? "Adult"
               : "Minor";;


        System.out.println(classification);
    }
}
