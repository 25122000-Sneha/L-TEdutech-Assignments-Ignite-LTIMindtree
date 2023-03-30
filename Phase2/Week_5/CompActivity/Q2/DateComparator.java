package Phase2.Week_5.CompActivity.Q2;
import java.util.*;
public class DateComparator implements Comparator<Transaction>{
    public int compare(Transaction obj1, Transaction obj2)
    {
        return obj1.getTransaction_date().compareTo(obj2.getTransaction_date());
    }
}
