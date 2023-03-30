package Phase2.Week_5.MapActivity.Q2;
import java.util.*;
public class UserMainCode {
    public static void findPass(HashMap<Integer,Integer> map)
    {
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getValue() > 75)
            {
                System.out.println(e.getKey());
            }
        }
        
    }
}
