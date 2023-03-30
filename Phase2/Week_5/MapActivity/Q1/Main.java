package Phase2.Week_5.MapActivity.Q1;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = reader.nextInt();
		for(int i=0; i<n; i++)
		{
			int k = reader.nextInt();
			int v = reader.nextInt();
			map.put(k, v);
		}
		int sum = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet())
		{
			if(e.getKey()%2==0)
			{
				sum += e.getValue();
			}

		}
		System.out.println(sum);
    }
}
