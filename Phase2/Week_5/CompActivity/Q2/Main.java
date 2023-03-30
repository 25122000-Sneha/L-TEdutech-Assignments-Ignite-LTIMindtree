package Phase2.Week_5.CompActivity.Q2;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner reader = new Scanner(System.in);
        char ch;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        ArrayList<Transaction> arr = new ArrayList<Transaction>();        
        
        int i= 1;
        do{
            System.out.println("Enter Transaction Details");
            System.out.println("Enter Transaction Amount");
            double amt = reader.nextDouble();
            reader.nextLine();
            System.out.println("Enter Location");
            String loc = reader.nextLine();
            System.out.println("Enter Transaction Status");
            String status = reader.nextLine();
            System.out.println("Enter Transaction Date");
            String tdate = reader.nextLine();
            System.out.println("Enter Receiver Account Id");
            long rid = reader.nextLong();
            System.out.println("Enter Sender Account Id");
            long sid = reader.nextLong();
            reader.nextLine();
            Transaction obj = new Transaction(i, amt, loc, status, sdf.parse(tdate), rid, sid);
            i++;
            arr.add(obj);
            System.out.println("Do you want to add transaction[Y/N]?");
            ch = reader.nextLine().charAt(0);

        }while(ch == 'y');
        while(true)
        {
            System.out.println("1.Sort by transaction date\n2.Sort by amount\n3.Exit\nEnter your choice:");
            int choice = reader.nextInt();
            switch(choice)
            {
                case 1:
                    Collections.sort(arr, new DateComparator());
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Transaction Id","Amount","Location","Status","Transaction Date","ReceiverId","SenderId");
                    for(Transaction obj : arr)
                    {
                        System.out.println(obj);
                    }
                    break;
                case 2:
                    Collections.sort(arr, new AmountComparator());
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Transaction Id","Amount","Location","Status","Transaction Date","ReceiverId","SenderId");
                    for(Transaction obj : arr)
                    {
                        System.out.println(obj);
                    }
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
            }
        }
        

    }
}
