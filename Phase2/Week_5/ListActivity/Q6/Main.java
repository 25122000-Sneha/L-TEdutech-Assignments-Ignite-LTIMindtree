package Phase2.Week_5.ListActivity.Q6;
import java.io.*;
import java.util.*;
class StackClass{
    private LinkedList<Customer> stackList = new LinkedList<Customer>();
    public void push(Customer obj)
    {
        stackList.addFirst(obj);
    }
    public Customer pop()
    {
        Customer obj = stackList.getFirst();
        stackList.removeFirst();
        return obj;
    }
    public boolean isEmpty()
    {
        if(stackList.isEmpty())
        {
            return true;
        }
        else 
        return false;
    }
}
public class Main {

    
    public static void main(String[] args) {
        StackClass st = new StackClass();
        try
        {
            FileInputStream fs = new FileInputStream("D:/Internship/Phase2/Week_5/ListActivity/Q6/input.txt");
            Scanner reader = new Scanner(fs);
            while(reader.hasNextLine())
            {
                String detail = reader.nextLine();
                String[] detailArr = detail.split(",");
                Customer obj = new Customer(detailArr[0], detailArr[1], detailArr[2]);
                st.push(obj);
            }
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("%-20s %-20s %-20s\n", "Customer Name", "Email", "Phone Number");
        System.out.println("----------------------------------------------------------------------------------");
        while(!st.isEmpty())
        {
            Customer obj = st.pop();
            System.out.printf("%-20s %-20s %-20s\n", obj.getName(), obj.getEmail(), obj.getPhoneNo());
        }
        System.out.println("----------------------------------------------------------------------------------");

    

    }

}
