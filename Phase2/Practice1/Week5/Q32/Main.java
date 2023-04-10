package Phase2.Practice1.Week5.Q32;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the transaction details");
        String ch;
        System.out.println("Enter account number");
        String accNo = reader.nextLine();
        System.out.println("Enter available amount");
        Double amt = Double.parseDouble(reader.nextLine());
        
        Transaction obj = new Transaction(accNo, amt);

        try
        {

            do 
            {
                System.out.println("Enter the transaction amount:");
                Double tAmt = Double.parseDouble(reader.nextLine());
                boolean bool = obj.validate(tAmt);
                System.out.println("Do you want to enter more?(yes/no)");
                ch = reader.nextLine();
                
                
            }while(ch.equals("yes"));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally 
        {
            System.out.println("Your available balance "+obj.getAmount());
        }
        
    }
}
