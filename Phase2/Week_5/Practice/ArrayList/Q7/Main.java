package Phase2.Week_5.Practice.ArrayList.Q7;
import java.util.*;
public class Main {
    public static int noOfDigits(int num)
    {
        int digits = 0;
        while(num!=0)
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
        System.out.println("Enter the participant details");
        LinkedList<String> list = new LinkedList<String>();
        
        for(int i=0; i<n; i++)
        {
            String d = reader.nextLine();
            String[] dArr = d.split("[_]");
            if((dArr[1].equals("IT") || dArr[1].equals("CSE") || dArr[1].equals("ECE")) && noOfDigits(Integer.parseInt(dArr[2]))==7)
            {
                list.add(d);
            }
        }
        
        if(list.isEmpty())
        {
            System.out.println("No valid participants");
        }
        else 
        {
            System.out.println("List of valid participants");
            for(String stud : list)
            {
                System.out.println(stud);
            }
        }
    }
}
