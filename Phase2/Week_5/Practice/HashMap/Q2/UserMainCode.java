package Phase2.Week_5.Practice.HashMap.Q2;
import java.util.*;
public class UserMainCode {
    public static void findPass(HashMap<Integer,Integer> map)
    {
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            int id = e.getKey();
            if(e.getValue() > 75)
            {
                System.out.println(id);
            }
        }
    }
}
