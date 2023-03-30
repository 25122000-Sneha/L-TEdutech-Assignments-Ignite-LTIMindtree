package Phase2.Week_5.MapActivity.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<n; i++)
		{
			int k = reader.nextInt();
			int v = reader.nextInt();
			map.put(k, v);
		}
		UserMainCode.findPass(map);
    }
}
