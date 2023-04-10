package Phase2.Practice1.Week5.Q43;
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        List<Integer>  list = new LinkedList<Integer>();
        list.add(50);
        list.add(null);
        list.add(90);
        list.add(null);
        System.out.println(list);
        String[] brics = {"Brazil", "Russia", "India", "China"};
        Arrays.sort(brics, null);
        for(String coun : brics)
        {
            System.out.println(coun);
        }
        
    }
}