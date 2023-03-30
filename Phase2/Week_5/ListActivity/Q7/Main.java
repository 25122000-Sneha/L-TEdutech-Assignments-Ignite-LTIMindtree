package Phase2.Week_5.ListActivity.Q7;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader1 = new Scanner(System.in);
        ArrayList<Customer> arr = new ArrayList<Customer>();
        try{
            FileInputStream fs = new FileInputStream("D:\\Internship\\Phase2\\Week_5\\ListActivity\\Q7");
            Scanner reader = new Scanner(fs);
            while(reader.hasNextLine())
            {
                String detail = reader.nextLine();
                String[] detailArr = detail.split("[,]");
                Customer obj = new Customer(detailArr[0], detailArr[1], detailArr[2], detailArr[3], detailArr[4]);
                arr.add(obj);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        while(true)
        {
            System.out.println("1)List\n2)Delete\n3)Exit");
            System.out.println("Enter your choice");
            int ch = reader1.nextInt();
            reader1.nextLine();
            
            

        }
    }
}
