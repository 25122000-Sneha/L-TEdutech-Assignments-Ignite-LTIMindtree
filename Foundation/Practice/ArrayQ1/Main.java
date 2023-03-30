package Foundation.Practice.ArrayQ1;
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
    public void addUser(User[] userArray, User userIns)
    {

    }
    public boolean deleteUser(User[] userArray, String name)
    {

    }
    public void displayAll(User[] userArray, int n)
    {

    }
}



public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int no = reader.nextInt();
        User[] userArray = new User[no];
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the details of User "+i);
            System.out.println("Enter name of user:");
            String n = reader.nextLine();
        
        }
    }
}
