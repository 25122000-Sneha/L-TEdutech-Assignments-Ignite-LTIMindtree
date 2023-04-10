package Phase2.Practice1.Week5.Q29;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Account> arr = new ArrayList<Account>();
        String ch;
        do
        {
            System.out.println("Enter Account details seperated by comma [Account Id,Account Balance,Account Number,status,Account Type,Customer Id]");
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Account obj = new Account(Integer.parseInt(detailArr[0]), Double.parseDouble(detailArr[1]), detailArr[2], detailArr[3], detailArr[4], detailArr[5]);
            arr.add(obj);
            System.out.println("Do you want to enter more Account details?(yes/no):");
            ch = reader.nextLine();

        }while(ch.equals("yes"));

        System.out.println("How do you want to sort the Account details?\nEnter your choice\n1.Account Balance\n2.Account Number");
        int choice = Integer.parseInt(reader.nextLine());
        switch(choice)
        {
            case 1:
                Collections.sort(arr, new AccountBalanceComparator());
                break;
            case 2:
                Collections.sort(arr, new AccountNumberComparator());
                break;
        }
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", "Account Id", "Account Number", "Account Balance", "Account Type", "status", "Customer Id");
        for(Account obj : arr)
        {
            System.out.println(obj);
        }
    }
}
