package Phase3.Practice.Q34;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try
        {
            System.out.println("Enter an integer input");
            int n = reader.nextInt();
            System.out.println("Entered value is "+n);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }

    }
}
