package Phase2.Practice1.Week5.Q29;
import java.util.*;
public class AccountNumberComparator implements Comparator<Account>{
    @Override 
    public int compare(Account obj1, Account obj2)
    {
        return obj1.getAccountNumber().compareTo(obj2.getAccountNumber());
    }
    
}
