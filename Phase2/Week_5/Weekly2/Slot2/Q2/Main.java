package Phase2.Week_5.Weekly2.Slot2.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<n; i++)
        {
            String key = reader.nextLine();
            int value = Integer.parseInt(reader.nextLine());
            map.put(key, value);
        }
        int x = Integer.parseInt(reader.nextLine());
        TreeMap<String, Integer> sortMap = new TreeMap<String, Integer>(map);
        int flag = 0;
        for(Map.Entry<String,Integer> e : sortMap.entrySet())
        {
            if(e.getValue()<= x)
            {
                flag++;
                System.out.println(e.getKey()+" : "+e.getValue());
            }
        }
        if(flag == 0)
        {
            System.out.println("Not found");
        }

    }
}
