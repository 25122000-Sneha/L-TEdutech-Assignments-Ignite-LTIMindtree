package Phase2.Week_5.Practice.TreeSet.Q2;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of integers:");
        int n = reader.nextInt();
        NumberSet ns = new NumberSet();
        for(int i=0; i<n; i++)
        {
            ns.insertElement(reader.nextInt());
        }
        System.out.println("Unique digit sum");
        SortedSet<Integer> set = ns.getSumOfDigits();
        for(Integer each : set)
        {
            System.out.println(each);
        }
    }
}