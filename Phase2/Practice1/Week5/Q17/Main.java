package Phase2.Practice1.Week5.Q17;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        TreeMap<String, TreeSet<String>> map = new TreeMap<String, TreeSet<String>>();
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split("[|]");
            String flight = detailArr[0];
            String passenger = detailArr[1];
            if(map.containsKey(flight))
            {
                TreeSet<String> set = map.get(flight);
                set.add(passenger);
                map.put(flight, set);
            }
            else 
            {
                TreeSet<String> set = new TreeSet<String>();
                set.add(passenger);
                map.put(flight, set);
            }

        }
        System.out.println("Flights and Passengers in ascending order");
        for(Map.Entry<String,TreeSet<String>> e : map.entrySet())
        {
            System.out.println(e.getKey());
            for(String name : e.getValue())
            {
                System.out.println("--"+name);
            }
        }
    }
}
