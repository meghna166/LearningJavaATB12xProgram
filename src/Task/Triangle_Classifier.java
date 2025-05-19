package Task;

public class Triangle_Classifier {
    public static void main(String[] args) {
        int side1 = 2, side2 = 3 , side3 = 3;
        if(side1 == side2 && side2 == side3) {

            System.out.println("Equilateral");
        }
            else if ((side1 == side2) || (side1 == side3) || (side2 == side3)){
                System.out.println("Isocelene");
            }

else{
                System.out.println("Scalene");
            }
        }

}
