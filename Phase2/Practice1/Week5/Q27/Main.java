package Phase2.Practice1.Week5.Q27;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of details");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("Enter contact details");
        ArrayList<Contact<String, String>> arr = new ArrayList<Contact<String, String>>();
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            if(detailArr[0].startsWith("91"))
            {
                Contact<String,String> obj = new Contact<String, String>(detailArr[0], detailArr[1]);
                arr.add(obj);
            }

        }
        System.out.println("List of contact numbers");
        for(Contact<String,String> contact : arr)
        {
            contact.print();
        }
    }
}
