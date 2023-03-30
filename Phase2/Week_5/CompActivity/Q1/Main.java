package Phase2.Week_5.CompActivity.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String ch;
        ArrayList<Account> arr = new ArrayList<Account>();
        do
        {
            System.out.println("Enter Account details seperated by comma [Account Id,Account Balance,Account Number,status,Account Type,Customer Id]");
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Account acc = new Account(Integer.parseInt(detailArr[0]), Double.parseDouble(detailArr[1]), detailArr[2], detailArr[3], detailArr[4], detailArr[5]);
            arr.add(acc);
            System.out.println("Do you want to enter more Account details?(yes/no):");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        System.out.println("How do you want to sort the Account details?\n1.Account Balance\n2.Account Number");
        int choice = reader.nextInt();
        switch(choice)
        {
            case 1:
                Collections.sort(arr, new AccountBalanceComparator());
                break;
            case 2:
                Collections.sort(arr, new AccountNumberComparator());
                break;
        }
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s","Account Id ","Account Number","Account Balance","Account Type","status","Customer Id");
        System.out.println();
        for(Account acc : arr)
        {
            System.out.println(acc);
        }

    }
}
/*
1,665.34,acc56,active,Savings,cus56
yes
4,1800,acc60,inactive,Salary,cus60
yes
5,600.35,acc58,active,Current,cus58
yes
10,543,acc57,inactive,Salary,cus57
no
2
 */