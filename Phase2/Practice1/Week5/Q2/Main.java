package Phase2.Practice1.Week5.Q2;
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
            String hall = reader.nextLine();
            arr.add(hall);

        }
        System.out.println("Enter the hall name to be searched:");
        String searchHall = reader.nextLine();
        int index = arr.indexOf(searchHall);
        if(index == -1)
        {
            System.out.println(searchHall+" hall is not found");

        }
        else
        {
            System.out.println(searchHall+" is found in the list at position "+index);
        }
        
    }
}
