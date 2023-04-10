package Phase2.Practice1.Week5.Q30;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<Address> arr = new ArrayList<Address>();
        System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Address obj = new Address(detailArr[0], detailArr[1], detailArr[2], Integer.parseInt(detailArr[3]));
            arr.add(obj);
        }
        Collections.sort(arr);
        System.out.println("User Details:");
        for(Address ad : arr)
        {
            System.out.println(ad);
        }
    }
}
