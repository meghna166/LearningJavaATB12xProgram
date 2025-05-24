package Task;
import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter your grade");
        String grade = scanner.next();

        if(grade.equals("A")){
            System.out.println("Excellent");
        } else if (grade.equals("B")) {
            System.out.println("Very Good");
        } else if (grade.equals("C")) {
            System.out.println("Good");
        }
        else if(grade.equals("D")){
            System.out.println("Need Improvement");
        }
        else{
            System.out.println("Retest");
        }

    }
}
