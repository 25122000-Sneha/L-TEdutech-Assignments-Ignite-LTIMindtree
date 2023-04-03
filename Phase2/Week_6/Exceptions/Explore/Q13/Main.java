package Phase2.Week_6.Exceptions.Explore.Q13;
//package Phase2.Week_6.Exceptions.Explore.Q13;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            int a[]=new int[2];
            a[2]=2/0;
        }
        catch(Exception e) {
            System.out.print("Exception ");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("ArrayIndexOutOfBoundsException ");
        }
        catch(ArithmeticException e) {
            System.out.print("ArithmeticException ");
        }
        
        
        System.out.print("Further Code");
         
    }
}
