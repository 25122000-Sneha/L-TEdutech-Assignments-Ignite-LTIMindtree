package Phase2.Practice1.Week5.Q29;
import java.util.*;
public class AccountBalanceComparator implements Comparator<Account>{
    @Override 
    public int compare(Account obj1, Account obj2)
    {
        return Double.compare(obj1.getAccountBalance(), obj2.getAccountBalance());
    }
    
}
