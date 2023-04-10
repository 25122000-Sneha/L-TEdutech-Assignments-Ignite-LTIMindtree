package Phase2.Practice1.OOP.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String detail;
        String[] detailArr;
        System.out.println("Choose Account Type\n1.Savings Account\n2.CurrentAccount");
        int ch = Integer.parseInt(reader.nextLine());
        switch(ch)
        {
            case 1:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                SavingsAccount obj1 = new SavingsAccount(detailArr[0], detailArr[1], detailArr[2], detailArr[3]);
                obj1.display();
                break;
            case 2:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                CurrentAccount obj2 = new CurrentAccount(detailArr[0], detailArr[1], detailArr[2], detailArr[3]);
                obj2.display();
                break;
        }
    }
}
