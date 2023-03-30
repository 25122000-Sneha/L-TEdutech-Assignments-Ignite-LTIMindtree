package Phase2.Week_5.SetActivity.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of users:");
        int n = reader.nextInt();
        reader.nextLine();
        HashSet<User> set1 = new HashSet<User>();
        List<User> arr = new ArrayList<User>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter details of user"+(i+1));
            System.out.println("Username:");
            String name = reader.nextLine();
            System.out.println("Bank name:");
            String bank = reader.nextLine();
            User user = new User(name, bank);
            set1.add(user);

        }
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String expUsers = reader.nextLine();
        String[] expArr = expUsers.split(",");
        for(String each : expArr)
        {
            User obj = new User(each, null);
            arr.add(obj);
        }
        
        Iterator itr = set1.iterator();
        while(itr.hasNext())
        {
            User obj = (User)itr.next();
            int flag = 0;
            for(User o : arr)
            {
                if(obj.equals(o))
                {
                    flag++;
                    break;
                }

            }
            if(flag == 0)
            {
                itr.remove();//only itr.remove() can alter collections while iterating
            }
        }
        ArrayList<User> expUserArr = new ArrayList<User>(set1);
        Collections.sort(expUserArr);

        System.out.println("Users going to expire within a month");
        int i = 1;
        for(User obj : expUserArr)
        {
            System.out.println("User "+i);
            i++;
            System.out.println("User Name = "+obj.getUsername());
            System.out.println("Bank Name = "+obj.getBankname());

        }
		
    }
}
