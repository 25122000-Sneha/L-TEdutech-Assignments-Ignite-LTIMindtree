package Phase2.Week_5.Practice.HashSet.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashSet<User> set = new HashSet<User>();
        System.out.println("Enter number of users");
        int n = Integer.parseInt(reader.nextLine());
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter details of user "+(i+1));
            System.out.println("Username:");
            String userName = reader.nextLine();
            System.out.println("Bank name:");
            String bankName = reader.nextLine();
            User obj = new User(userName, bankName);
            set.add(obj);
        }
        ArrayList<User> arr = new ArrayList<User>();
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String names = reader.nextLine();
        String[] namesArr = names.split(",");
        for(int i=0; i<namesArr.length; i++)
        {
            User obj = new User(namesArr[0], null);
            arr.add(obj);
        }
        System.out.println(arr);
        set.retainAll(arr);
        System.out.println(set);
        System.out.println("Users going to expire within a month");
        int i = 1;
        for(User obj : set)
        {
            System.out.println("User "+i);
            i++;
            System.out.println("User Name = "+obj.getUserName());
            System.out.println("Bank Name = "+obj.getBankName());
        }

    }
}
