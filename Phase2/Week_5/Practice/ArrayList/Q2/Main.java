package Phase2.Week_5.Practice.ArrayList.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = Integer.parseInt(reader.nextLine());
        
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the Hall Name "+(i+1));
            String hallName = reader.nextLine();
            arr.add(hallName);
        }
        System.out.println("Enter the hall name to be searched:");
        String searchHall = reader.nextLine();
        if(arr.contains(searchHall))
        {
            System.out.println(searchHall+" hall is found in the list at position "+arr.indexOf(searchHall));
        }
        else 
        {
            System.out.println(searchHall+" hall is not found");
            
        }
        

    }
}
