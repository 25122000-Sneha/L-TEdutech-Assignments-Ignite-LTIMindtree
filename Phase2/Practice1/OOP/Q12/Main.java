package Phase2.Practice1.OOP.Q12;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
        int ch = reader.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter the radius:");
                double r = reader.nextDouble();
                Circle c = new Circle(r);
                c.computeArea();
                System.out.println("Area of circle is "+String.format("%.2f", c.area));
                break;
            case 2:
                System.out.println("Enter the length and breadth:");
                double l = reader.nextDouble();
                double b = reader.nextDouble();
                Rectangle rect = new Rectangle(l, b);
                rect.computeArea();
                System.out.println("Area of rectangle is "+String.format("%.2f", rect.area));
                break;
            case 3:
                System.out.println("Enter the base and height:");
                double base = reader.nextDouble();
                double height = reader.nextDouble();
                Triangle tria = new Triangle(base, height);
                tria.computeArea();
                System.out.println("Area of triangle is "+String.format("%.2f", tria.area));
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);

        }
    }
}
