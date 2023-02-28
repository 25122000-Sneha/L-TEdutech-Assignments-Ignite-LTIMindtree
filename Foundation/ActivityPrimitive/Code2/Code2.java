package Foundation.ActivityPrimitive.Code2;
import java.util.*;
public class Code2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Enter the name of the event");
                String eventName = reader.nextLine();
                System.out.println("Enter the type of the event");
                String eventType = reader.nextLine();
                System.out.println("Enter the number of people expected");
                int numberOfPeople = reader.nextInt();
                System.out.println("Is it a paid entry? (Type Y or N)");
                String str = reader.next();
                char entry = str.charAt(0);
                System.out.println("Enter the projected expenses (in lakhs) for this event");
                double expenses = reader.nextDouble();

                System.out.println("Event Name : "+eventName);
                System.out.println("Event Type : "+eventType);
                System.out.println("Expected Count : "+numberOfPeople);
                System.out.println("Paid Entry : "+entry);
                System.out.println("Projected Expense : "+Math.round(expenses*Math.pow(10,1))/Math.pow(10,1)+"L");
                reader.close();
    }
}
