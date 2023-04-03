package Phase2.Week_6.Exceptions.Codes.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an integer input");
        int n;
        try{
            n = reader.nextInt();
            System.out.println("Entered value is "+n);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        
    }
}
