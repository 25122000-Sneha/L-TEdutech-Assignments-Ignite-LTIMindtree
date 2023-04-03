package Phase2.Week_6.LambdaExpActivity.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of halls:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<Hall> arr = new ArrayList<Hall>();
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Hall h = new Hall(detailArr[0], Double.parseDouble(detailArr[1]), detailArr[2]);
            arr.add(h);
        }
        Collections.sort(arr, (Hall h1, Hall h2) -> {return h1.getOwner().compareTo(h2.getOwner());});
        System.out.printf("%-15s %-10s %s\n","Name","Cost","Owner");
        for(Hall h : arr)
        {
            System.out.println(h);
        }
    }
}
