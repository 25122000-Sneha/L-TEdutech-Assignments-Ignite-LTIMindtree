package Phase2.Week_5.TreeSetActivity.Q2;
import java.util.*;
public class Main {
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
		TreeSet<Integer> sumSet = ns.getSumOfDigits();
		for(int each : sumSet)
		{
			System.out.println(each);
		}
    }
}
