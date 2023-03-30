package Foundation.Activities.Assessment1.Weekly2;
import java.util.*;

class Employee
{
    String name, address, phoneNo, email;
    public Employee(String n, String a, String p, String e)
    {
        this.name = n;
        this.address = a;
        this.phoneNo = p;
        this.email = e;
    }
}


public class EmpDirectory {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int no = reader.nextInt();
        Employee[] arr = new Employee[no];
        for(int i=0; i<no; i++)
        {
            reader.nextLine();
            //System.out.println("Enter details of user "+(i+1));
            //System.out.println("Enter name:");
            String n = reader.nextLine();
            //System.out.println("Entet address:");
            String a = reader.nextLine();
            //System.out.println("Enter phone number:");
            String pn = reader.nextLine();
            //System.out.println("Enter email:");
            String e = reader.nextLine();
            arr[i] = new Employee(n, a, pn, e);
        }
        //System.out.println("Enter searchEmp Name:");
        String searchName = reader.nextLine();
        int flag = 0;
        for(int i=0; i<no; i++)
        {
            if(arr[i].name.equals(searchName))
            {
                System.out.println(arr[i].name+": "+arr[i].address+", "+arr[i].phoneNo+", "+arr[i].email);
                flag++;
                return;
            }
        }
        if(flag == 0)
        {
            System.out.println("Searched Employee Not Found");
        }
    }
}
