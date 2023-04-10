package Phase2.Practice1.Week5.Q28;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<Hall> arr = new ArrayList<Hall>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of hall "+(i+1));
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Hall obj = new Hall(detailArr[0], detailArr[1], Double.parseDouble(detailArr[2]), detailArr[3]);
            arr.add(obj);
        }
        Collections.sort(arr);
        System.out.println("Sorted Order (from the least expensive to the most):");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Contact number", "Cost per day", "Owner name");
        for(Hall h : arr)
        {
            System.out.println(h);
        }
    }
}
