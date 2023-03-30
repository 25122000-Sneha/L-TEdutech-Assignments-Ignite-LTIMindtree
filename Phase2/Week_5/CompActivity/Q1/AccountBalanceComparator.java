package Phase2.Week_5.CompActivity.Q1;
import java.util.*;
public class AccountBalanceComparator implements Comparator<Account>{
    public int compare(Account acc1, Account acc2)
    {
        return Double.compare(acc1.getAccBalance(), acc2.getAccBalance());
    }
    
}
