package Phase2.Practice1.Week5.Q22;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of address");
        int n = Integer.parseInt(reader.nextLine());
        Map<String, List<Address>> map = new HashMap<String, List<Address>>();
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the address "+(i+1)+" detail");
            String ad = reader.nextLine();
            String[] adArr = ad.split(",");
            Address obj = new Address(adArr[0], adArr[1], adArr[2], adArr[3], Integer.parseInt(adArr[4]));
            map = obj.generateCityAddressMap(map, obj);
        }
        System.out.println("Enter the city to be searched");
        String city = reader.nextLine();
        Address obj = new Address();
        if(obj.searchCity(map, city) == null)
        {
            System.out.println("Searched city not found");
        }
        else 
        {
            List<Address> list = obj.searchCity(map, city);
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
            for(Address address : list)
            {
                System.out.printf("%-15s %-15s %-15s %-15s %s\n", address.getAddressLine1(), address.getAddressLine2(), address.getCity(), address.getState(), address.getPincode());
            }
        }
    }
}
