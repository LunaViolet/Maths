import java.util.Scanner;
public class areaCircle {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

            System.out.println("Enter the Radius:");
            double r= s.nextDouble();
            double area=(22*r*r)/7;
            System.out.println("Area of Circle is: " + area);
    }
}
