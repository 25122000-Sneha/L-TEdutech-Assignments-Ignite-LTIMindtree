package Phase2.Week_5.ListActivity.Q9;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of passengers Booked");
        int no = Integer.parseInt(reader.nextLine());
        ArrayList<String> arr = new ArrayList<String>();
        
        System.out.println("Enter the passenger's name who Booked");
        for(int i=0; i<no; i++)
        {
            String name = reader.nextLine();
            arr.add(name);
        }
        System.out.println("Enter the numberof seats available");
        int seats = Integer.parseInt(reader.nextLine());
        Iterator itr = arr.iterator();
        int count = 0;
        while(itr.hasNext() && count<seats)
        {
            String pasName = (String)itr.next();
            itr.remove();
            count++;
        }
        System.out.println("Extra Passengers list");
        System.out.println(arr);
    }
}
