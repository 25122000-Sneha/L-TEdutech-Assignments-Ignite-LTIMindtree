package Phase2.Week_5.MapActivity.Q7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of address:");
        int no = reader.nextInt();
        reader.nextLine();
        TreeMap<String, TreeMap<String,Integer>> map = new TreeMap<String, TreeMap<String,Integer>>();
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the address:");
            String address = reader.nextLine();
            String[] adArr = address.split(",");
            String state = adArr[2];
            String city = adArr[1];
            if(map.containsKey(state))
            {
                TreeMap<String,Integer> cityMap = map.get(state);
                if(cityMap.containsKey(city))
                {
                    cityMap.put(city, cityMap.get(city)+1);
                }
                else 
                {
                    cityMap.put(city, 1);
                }
            }
            else 
            {
                TreeMap<String,Integer> cityMap = new TreeMap<String,Integer>();
                cityMap.put(city, 1);
                map.put(state, cityMap);
            }

        }
        //System.out.println(map);
        System.out.println("Number of entries in city/state wise:\n");
        for(Map.Entry<String, TreeMap<String,Integer>> e : map.entrySet())
        {
            System.out.println("State:"+e.getKey());
            for(Map.Entry<String,Integer> ce : e.getValue().entrySet())
            {
                System.out.println("City:"+ce.getKey()+" Count:"+ce.getValue());
            }
            System.out.println();
        }
    }
}
