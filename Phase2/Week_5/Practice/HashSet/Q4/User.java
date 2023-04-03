package Phase2.Week_5.Practice.HashSet.Q4;
import java.util.*;
public class User implements Comparable<User>{
    private String userName, bankName;

    public User(String userName, String bankName) {
        this.userName = userName;
        this.bankName = bankName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    @Override
    public int compareTo(User that)
    {
        return this.userName.compareTo(that.userName);
    }
    @Override
    public boolean equals(Object o)
    {
        if(o == this) 
        {
            return true;
        }
        if(!(o instanceof User))
        {
            return false;
        }
        User obj = (User)o;
        return (this.userName.compareTo(obj.userName)==0);
    }
}
