package Phase2.Practice1.Week5.Q16;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of integers:");
        int n = Integer.parseInt(reader.nextLine());
        NumberSet obj = new NumberSet();
        for(int i=0; i<n; i++)
        {
            int num = Integer.parseInt(reader.nextLine());
            obj.insertElement(num);
        }
        SortedSet<Integer> set = obj.getSumOfDigits();
        System.out.println("Unique digit sum");
        for(int each : set)
        {
            System.out.println(each);
        }
    }
}
