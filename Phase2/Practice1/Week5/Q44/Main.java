package Phase2.Practice1.Week5.Q44;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(101);
        arr.add(202);
        arr.add(303);
        
        arr.add(407);
        arr.add(500);
        
        arr.add(600);

        ListIterator itr = arr.listIterator();
        while(itr.hasNext())
        {
            int num = (int)itr.next();
            if(num%2!=0)
            {
                num ++;
                itr.set(num);
            }
        }
        System.out.println(arr);
    }
}
