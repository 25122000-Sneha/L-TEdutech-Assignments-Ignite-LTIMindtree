package Phase2.Week_5.Generics.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of details");
        int n = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter contact details");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split("[,]");
            Contact<String, Integer> obj = new Contact<String, Integer>();

        }

    }
}
