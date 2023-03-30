package Phase2.Week_5.CompActivity.Q6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
        ArrayList<Address> arr = new ArrayList<Address>();
        for(int i=0; i<n; i++)
        {
            String ad = reader.nextLine();
            String[] adArr = ad.split("[,]");
            Address obj = new Address(adArr[0], adArr[1], adArr[2], Integer.parseInt(adArr[3]));
            arr.add(obj);
        }
        Collections.sort(arr);
        System.out.println("User Details:");
        for(Address obj : arr)
        {
            System.out.println(obj.getUsername()+","+obj.getAddessLine1()+","+obj.getAddressLine2()+","+obj.getPinCode());
        }
    }
}
