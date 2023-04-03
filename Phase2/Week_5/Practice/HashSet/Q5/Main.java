package Phase2.Week_5.Practice.HashSet.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of colleges");
        int n = Integer.parseInt(reader.nextLine());
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        System.out.println("Enter the college details one by one");
        for(int i=0; i<n; i++)
        {
            String clg = reader.nextLine();
            set.add(clg);
        }
        System.out.println("Enter number of colleges to be displayed");
        int no = Integer.parseInt(reader.nextLine());
        if(no > n)
        {
            System.out.println("Invalid");
            System.exit(0);

        }
        else 
        {
            System.out.println("First "+no+" college details");
            Iterator itr = set.iterator();
            int count = 0;
            while(itr.hasNext() && count!=no)
            {
                System.out.println(itr.next());
                count++;
            }
        }
        System.out.println("Enter the collage code to search :");
        String code = reader.nextLine();
        int flag = 0;
        for(String clg : set)
        {
            String[] arr = clg.split("[-]");
            if(arr[0].equals(code))
            {
                flag ++;
                System.out.println("Entered college code is found");
            }
        }
        if(flag == 0)
        {
            System.out.println("Entered college code is not found");
        }

    }
}
