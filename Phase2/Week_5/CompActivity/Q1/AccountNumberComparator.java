package Phase2.Week_5.CompActivity.Q1;
import java.util.*;
public class AccountNumberComparator implements Comparator<Account>{
    @Override
    public int compare(Account acc1, Account acc2)
    {
        return acc1.getAccNum().compareTo(acc2.getAccNum());
    }
    
}
