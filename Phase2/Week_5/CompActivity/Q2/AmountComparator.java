package Phase2.Week_5.CompActivity.Q2;
import java.util.*;
public class AmountComparator implements Comparator<Transaction>{
    @Override
    public int compare(Transaction obj1, Transaction obj2)
    {
        return Double.compare(obj1.getAmount(), obj2.getAmount());
    }
}
