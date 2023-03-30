package Phase2.Week_5.TreeSetActivity.Q2;
import java.util.*;
public class NumberSet {
    private Set<Integer> numberSet = new LinkedHashSet<Integer>();
    public void insertElement(Integer elem)
    {
        numberSet.add(elem);
    }
    public TreeSet<Integer> getSumOfDigits()
    {
        TreeSet<Integer> sumSet = new TreeSet<Integer>();
        int sum;
        for(int num : numberSet)
        {
            sum = 0;
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
