package Phase2.Week_5.Practice.TreeSet.Q2;
import java.util.*;
public class NumberSet {
    private Set<Integer> numberSet = new HashSet<Integer>();
    public void insertElement(Integer elem)
    {
        numberSet.add(elem);
    }
    public SortedSet<Integer> getSumOfDigits()
    {
        TreeSet<Integer> sumSet = new TreeSet<Integer>();
        for(int num : numberSet)
        {
            int sum = 0;
            while(num!=0)
            {
                int digit = num%10;
                sum += digit;
                num = num/10;
            }
            sumSet.add(sum);
        }
        return sumSet;
    }
}

