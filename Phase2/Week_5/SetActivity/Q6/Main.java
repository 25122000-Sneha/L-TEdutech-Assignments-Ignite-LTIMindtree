package Q6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		Set<Integer> set1 = new TreeSet<Integer>();
		Set<Integer> set2 = new TreeSet<Integer>();
		System.out.println("Enter the number of values in list 1");
		int no1 = reader.nextInt();
		System.out.println("Enter the values");
		for(int i=0; i<no1; i++)
		{
			set1.add(reader.nextInt());
		}
		System.out.println("Enter the number of values in list 2");
		int no2 = reader.nextInt();
		System.out.println("Enter the values");
		for(int i=0; i<no2; i++)
		{
			set2.add(reader.nextInt());
		}
		System.out.println("Set 1");
		for (int each : set1)
		{
			System.out.println(each);
		}
		System.out.println("Set 2");
		for(int each : set2)
		{
			System.out.println(each);
		}
		System.out.println("Union");
		set1.addAll(set2);
		for(int each : set1)
		{
			System.out.println(each);
		}
    }
}
