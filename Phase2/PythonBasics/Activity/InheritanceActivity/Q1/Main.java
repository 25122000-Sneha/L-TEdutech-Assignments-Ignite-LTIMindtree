package Phase2.PythonBasics.Activity.InheritanceActivity.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
		int ch = reader.nextInt();
        reader.nextLine();
		switch(ch)
		{
			case 1:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
                String detailsS = reader.nextLine();
                String[] detailsArrS = detailsS.split(",");
                // for (String each : detailsArrS)
                // {
                //     System.out.println(each);
                // }
                SavingsAccount objS = new SavingsAccount(detailsArrS[0], detailsArrS[1], detailsArrS[2], detailsArrS[3]);
                objS.display();
                break;
			case 2:
                System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
                String detailsC = reader.nextLine();
                String[] detailsArrC = detailsC.split(",");
                CurrentAccount objC = new CurrentAccount(detailsArrC[0], detailsArrC[1], detailsArrC[2], detailsArrC[3]);
                objC.display();
                break;
		}

    }
}
