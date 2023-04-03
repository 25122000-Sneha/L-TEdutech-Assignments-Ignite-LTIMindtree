package Phase2.Week_5.Practice.Map;
import java.util.*;
public class IterationMap {
    public static void main(String[] args) {
        var map = new TreeMap<Integer, Double>();
        map.put(10, Math.sqrt(10));
        map.put(30, Math.sqrt(30));
        map.put(50, Math.sqrt(50));
        map.put(40, Math.sqrt(40));
        map.put(20, Math.sqrt(20));

        //Modified for loop
        for(Map.Entry<Integer, Double> e : map.entrySet())
        {
            System.out.println(e);
        }
        //iterator interface
        Iterator itr = map.keySet().iterator();
        while(itr.hasNext())
        {
            int key = (int)itr.next();
            System.out.println("key:"+key+" value:"+map.get(key));
        }

    }
}
