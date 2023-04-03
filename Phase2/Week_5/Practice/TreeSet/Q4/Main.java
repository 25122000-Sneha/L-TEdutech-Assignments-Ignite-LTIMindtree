package Phase2.Week_5.Practice.TreeSet.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        TreeMap<String, TreeSet<String>> map = new TreeMap<String, TreeSet<String>>();
        for(int i=0; i<n; i++)
        {
            String flight = reader.nextLine();
            String[] flightArr = flight.split("[|]");
            String flightName = flightArr[0];
            String passenger = flightArr[1];
            if(map.containsKey(flightName))
            {
                TreeSet<String> set = map.get(flightName);
                set.add(passenger);
                map.put(flightName, set);
            }
            else 
            {
                TreeSet<String> set = new TreeSet<String>();
                set.add(passenger);
                map.put(flightName, set);
            }

        }
        System.out.println("Flights and Passengers in ascending order");
        for(Map.Entry<String, TreeSet<String>> e: map.entrySet())
        {
            System.out.println(e.getKey());
            for(String passenger : e.getValue())
            {
                System.out.println("--"+passenger);
            }
        }
    }
}
