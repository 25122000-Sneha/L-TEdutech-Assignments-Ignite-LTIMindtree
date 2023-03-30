package Phase2.Week_5.CompActivity.Q4;
import java.util.*;
class descendingValueComparator implements Comparator<Map.Entry<String, Integer>>
{
    @Override
    public int compare(Map.Entry<String, Integer> obj1,
                               Map.Entry<String, Integer> obj2)
    {
        if(Integer.compare(obj2.getValue(), obj1.getValue()) == 0)
        {
            return obj2.getKey().compareTo(obj1.getKey());
        }
        
        return Integer.compare(obj2.getValue(), obj1.getValue());
    }
}
public class Main {
    public static LinkedHashMap<String,Integer> sortByValueAge(HashMap<String,Integer> map)
    {
        ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        Collections.sort(arr, new descendingValueComparator());
        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> e : arr)
        {
            sortedMap.put(e.getKey(), e.getValue());
        } 
        return sortedMap;

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of passengers");
        int n = reader.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        reader.nextLine();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the name of passenger "+(i+1));
            String name = reader.next();
            System.out.println("Enter the age of the passenger "+(i+1));
            int age = reader.nextInt();
            //reader.nextLine();
            map.put(name, age);
        }
        LinkedHashMap<String,Integer> newMap = sortByValueAge(map);
        System.out.println("Passengers Details by age(High to Low)");
        int count = 0;
        for(Map.Entry<String,Integer> e : newMap.entrySet())
        {
            System.out.println((count+1)+" "+ e.getKey()+" "+e.getValue());
            count++;
        }

    }
}
/*
5
Sweety
21
Swetha
26
Anitha
56
Harish
56
Diwakar
27
 */