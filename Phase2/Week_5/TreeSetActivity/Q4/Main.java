package Phase2.Week_5.TreeSetActivity.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        reader.nextLine();
        TreeMap<String, TreeSet<String>> map = new TreeMap<String, TreeSet<String>>();
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split("[|]");
            
            if(map.containsKey(detailArr[0]))
            {
                TreeSet<String> set = map.get(detailArr[0]);
                set.add(detailArr[1]);
                map.put(detailArr[0], set);
            }
            else 
            {
                TreeSet<String> set = new TreeSet<String>();
                set.add(detailArr[1]);
                map.put(detailArr[0], set);
            }
        }
        System.out.println("Flights and Passengers in ascending order");
        for(Map.Entry<String,TreeSet<String>> e : map.entrySet())
        {
            System.out.println(e.getKey());
            TreeSet<String> set = e.getValue();
            for(String passenger : set)
            {
                System.out.println("--"+passenger);
            }
        }
    }
}
/*
5
Spicejet|shanmathi
KingFisher|Thara
Spicejet|Haveena
KingFisher|Priya
AirIndia|Krishna
 */
