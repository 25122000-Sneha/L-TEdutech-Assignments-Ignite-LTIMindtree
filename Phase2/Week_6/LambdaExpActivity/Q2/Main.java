package Phase2.Week_6.LambdaExpActivity.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of item types:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<ItemType> arr = new ArrayList<ItemType>();
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            ItemType obj = new ItemType(detailArr[0], Double.parseDouble(detailArr[1]), Double.parseDouble(detailArr[2]));
            arr.add(obj);
        }
        Collections.sort(arr, (obj1, obj2) -> {return obj1.getName().compareTo(obj2.getName());});
        System.out.printf("%-10s %-10s %s\n","Name","Cost","Deposit");
        for(ItemType obj : arr)
        {
            System.out.println(obj);
        }

    }
}
