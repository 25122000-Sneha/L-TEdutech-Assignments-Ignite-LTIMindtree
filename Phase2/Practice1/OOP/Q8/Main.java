package Phase2.Practice1.OOP.Q8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name");
        String n = reader.nextLine();
        System.out.println("Enter the accountType [Current , Savings, Demat]");
        String t = reader.nextLine();
        System.out.println("Enter the balance");
        double bal = Double.parseDouble(reader.nextLine());
        Customer obj = new Customer(n,t,bal);
        double amt;
        while(true)
        {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
            int ch = Integer.parseInt(reader.nextLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    amt = Double.parseDouble(reader.nextLine());
                    obj.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    amt = Double.parseDouble(reader.nextLine());
                    obj.withdrawal(amt);
                    break;
                case 3:
                    System.out.println("Number of Transactions done : "+obj.getNoOfTransactions());
                    System.exit(0);

            }
        }
    }
}
