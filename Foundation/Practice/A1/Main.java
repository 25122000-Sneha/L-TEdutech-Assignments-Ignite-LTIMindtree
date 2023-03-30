package Foundation.Practice.A1;
import java.util.*;
class User{
    private String name, mobNo, userName, password;
    public User(String name, String mobNo, String userName, String password)
    {
        this.name = name;
        this.mobNo = mobNo;
        this.userName = userName;
        this.password = password;
    }
    public String getName()
    {
        return name;
    }
    public String getMobNo()
    {
        return mobNo;

    }
    public String getUserName()
    {
        return userName;
    }
    public String getPassword()
    {
        return password;
    }
}

class UserBO{
    public void addUser(User[] userArray, User userIns, int index)
    {
        userArray[index] = userIns;
    }
    public boolean deleteUser(User[] userArray, String name)
    {
        for(int i=0; i<userArray.length; i++)
        {
            if(userArray[i].getName().equals(name))
            {
                for(int j=i; j<userArray.length-1; j++)
                {
                    userArray[j] = userArray[j+1];
                }
                return true;
            }
        }
        return false;
    }
    public void displayAll(User[] userArray, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println("User Details:");
            System.out.println("User "+(i+1));
            System.out.println("Name:"+userArray[i].getName());
            System.out.println("Mobile Number:"+userArray[i].getMobNo());
        }
    }

    public void searchUser(User[] userArray, String name)
    {
        for(int i=0; i<userArray.length; i++)
        {
            if(userArray[i].getName().equals(name))
            {
                System.out.println("Searched user is:");
                System.out.println("Name:"+userArray[i].getName());
                System.out.println("Mobile Number:"+userArray[i].getMobNo());
                return;
            }
        }
        System.out.println("Serached user not found");

    }
}






public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the numbedr of users:");
        int no = reader.nextInt();
        User[] userArray = new User[no];
        UserBO ubo = new UserBO();
        for(int i=0; i<no; i++)
        {
            reader.nextLine();
            System.out.println("Enter details of User "+(i+1));
            System.out.println("Enter name of the user:");
            String n = reader.nextLine();
            System.out.println("Enter mobile number of user:");
            String mob = reader.nextLine();
            System.out.println("Enter username of user:");
            String un = reader.nextLine();
            System.out.println("Enter password of user:");
            String p = reader.nextLine();
            User obj = new User(n, mob, un, p);
            ubo.addUser(userArray, obj, i);
        }
        System.out.println("User Details as entered:");
        ubo.displayAll(userArray, no);
        System.out.println("Enter the user to be deleted:");
        String name = reader.nextLine();
        boolean b = ubo.deleteUser(userArray, name);
        if(b == false)
        {
            System.out.println("No user found with given name");
        }
        else 
        {
            System.out.println("User deleted successfully");
            System.out.println("After Deleting:");
            ubo.displayAll(userArray, no-1);
        }
        System.out.println("Enter the name of user to be searched:");
        String searchName = reader.nextLine();
        ubo.searchUser(userArray, searchName);
    }
}
