package Phase2.Week_5.Practice.ArrayList.Q8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of passengers Booked");
        int n = Integer.parseInt(reader.nextLine());
        
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> extraArr = new ArrayList<String>();
        System.out.println("Enter the passenger's name who Booked");
        for(int i=0; i<n; i++)
        {
            String name = reader.nextLine();
            arr.add(name);
        }
        System.out.println(arr);
        System.out.println("Enter the number of seats available");
        int seats = Integer.parseInt(reader.nextLine());
        for(int i=seats; i<n; i++)
        {
            extraArr.add(arr.get(i));
        }
        System.out.println("Extra Passengers list");
        System.out.println(extraArr);
        
    }
}
