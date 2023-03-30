package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
		int n = reader.nextInt();
        
        if(n==1)
        {
            System.out.println("Enter the radius:");
               // fill the code
            double r = reader.nextDouble();
            Shape s = new Circle(r);
            s.computeArea();
            System.out.println("Area of circle is "+String.format("%.2f", s.area));
        }
        else if(n==2)
        {
            System.out.println("Enter the length and breadth:");
               // fill the code
            double l = reader.nextDouble();
            double b = reader.nextDouble();
            Shape s = new Rectangle(l, b);
            s.computeArea();
            System.out.println("Area of rectangle is "+String.format("%.2f", s.area));
        }
        else if(n==3)
        {
            System.out.println("Enter the base and height:");
               // fill the code
            double base = reader.nextDouble();
            double height = reader.nextDouble();
            Shape s = new Triangle(base, height);
            s.computeArea();
            System.out.println("Area of triangle is "+String.format("%.2f", s.area));
        }
        else
        {
             System.out.format("Invalid choice");
        }
    }
}
