package Phase2.Week_5.Practice.HashMap.Q1;
import java.util.*;
public class UserMainCode {
    public static int getSumOfEven(HashMap<Integer, Integer> map)
    {
        int sum = 0;
        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            if(e.getKey()%2==0)
            {
                sum += e.getValue();
            }
        }
        return sum;
    }
}
