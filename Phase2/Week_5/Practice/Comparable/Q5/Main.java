package Phase2.Week_5.Practice.Comparable.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = reader.nextInt();
        reader.nextLine();
        ArrayList<Hall> arr = new ArrayList<Hall>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of hall "+(i+1));
            String detail = reader.nextLine();
            String[] detailArr = detail.split("[,]");
            Hall h = new Hall(detailArr[0], detailArr[1], Double.parseDouble(detailArr[2]), detailArr[3]);
            arr.add(h);
        }
        

    }
}
