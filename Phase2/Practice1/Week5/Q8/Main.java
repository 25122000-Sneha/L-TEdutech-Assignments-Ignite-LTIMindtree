package Phase2.Practice1.Week5.Q8;
import java.util.*;
public class Main {
    public static int countDigits(int num)
    {
        int digits = 0;
        while(num != 0)
        {
            digits++;
            num = num/10;
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of participants to be registered :");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("Enter the participants details");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split("[_]");
            String dept = detailArr[1];
            int roll = Integer.parseInt(detailArr[2]);
            if((dept.equals("CSE") || dept.equals("IT") || dept.equals("ECE")) && (countDigits(roll)==7))
            {
                arr.add(detail);
            }

        }
        if(arr.isEmpty())
        {
            System.out.println("No valid participants");
        }
        else 
        {
            System.out.println("List of valid participants");
            for(String detail : arr)
            {
                System.out.println(detail);
            }
        }
    }
}
