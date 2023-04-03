package Phase2.Week_6.Exceptions.Explore.Q11;
import java.util.*;
public class Main {
    static int computeDivision(int a, int b) {
        int res =0;
        try {
            res = a/b;
        }
        catch(NumberFormatException ex) {
            System.out.println("NumberFormatException");
        }
        return res;
        }
    public static void main(String args[]) {
        int a = 1,b = 0;
        try {
            int i = computeDivision(a,b);
            System.out.println(i);
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
