package Phase2.Practice1.Week5.Q16;
import java.util.*;
public class NumberSet {
    private Set<Integer> numberSet = new HashSet<Integer>();
    public void insertElement(Integer elem)
    {
        numberSet.add(elem);
    }
    public SortedSet<Integer> getSumOfDigits()
    {
        SortedSet<Integer> sumSet = new TreeSet<Integer>();
        for(Integer num : numberSet)
        {
            int sum = 0;
            while(num!=0)
            {
                int dig = num%10;
                sum += dig;
                num = num/10;
            }
            sumSet.add(sum);

        }
        return sumSet;
    }

}
