package Phase2.Practice1.Week5.Q20;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++)
        {
            int k = reader.nextInt();
            int v = reader.nextInt();
            map.put(k,v);
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
