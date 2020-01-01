import java.util.Scanner;

public class timesTwoNumbers {
    public static void main (String args[])
    {
        Scanner s=new Scanner(System.in);
            System.out.println("Enter the first Value:");
            double l=s.nextDouble();
            System.out.println("Enter another value:");
            double m=s.nextDouble();
        double value= (l*m);
        System.out.println("The two values equal " + value);
    }
}
