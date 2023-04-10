package Phase2.Practice1.Week5.Q13;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of colleges");
        int n  = Integer.parseInt(reader.nextLine());
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        System.out.println("Enter the college details one by one");
        for(int i=0; i<n; i++)
        {
            set.add(reader.nextLine());
        }
        System.out.println("Enter number of colleges to be displayed");
        int displayNo = Integer.parseInt(reader.nextLine());
        if(displayNo > n)
        {
            System.out.println("Invalid");
        }
        else 
        {
            int count = 0;
            Iterator itr = set.iterator();
            while(itr.hasNext() && count<displayNo)
            {
                System.out.println(itr.next());
                count++;
            }
        }
        System.out.println("Enter the college code to search");
        String searchCode = reader.nextLine();
        int flag = 0;
        for(String clg : set)
        {
            String[] detailArr = clg.split("[-]");
            if(detailArr[0].equals(searchCode))
            {
                System.out.println("Entered clg code found");
                flag++;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("Entered clg code not found");
        }
        
    }
}
