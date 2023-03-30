package Phase2.Practice.Java.C3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name");
        String n = reader.nextLine();
        System.out.println("Enter the accountType[Current,Savings,Demat]");
        String t = reader.nextLine();
        System.out.println("Enter the balance");
        double b = reader.nextDouble();
        Customer c = new Customer();
        c.setName(n);
        c.setAccount(t);
        c.setBalance(b);
        double amt;
        while(true)
        {
            System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
            int ch = reader.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    amt = reader.nextDouble();
                    c.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    amt = reader.nextDouble();
                    c.withdrawal(amt);
                    break;
                case 3:
                    System.out.println("Number of Transactions done :"+c.getNoOfTransactions());
                    System.exit(0);

            }
        }

    }
}
