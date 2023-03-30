package Phase2.Week_5.MapActivity.Q6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of address");
        int no = reader.nextInt();
        reader.nextLine();
        HashMap<String, List<Address>> map = new HashMap<String, List<Address>>();
        Map<String, List<Address>> map1 = new HashMap<String, List<Address>>();
        for(int i=0; i<no; i++)
        {
            System.out.println("Enter the address "+(i+1)+" detail");
            String adDetail = reader.nextLine();
            String[] adArr = adDetail.split(",");
            Address obj = new Address(adArr[0], adArr[1], adArr[2], adArr[3], Integer.parseInt(adArr[4]));
            map1 = obj.generateCityAddressMap(map, obj);
        }

        //System.out.println(map1);
        System.out.println("Enter the city to be searched");
        String city = reader.nextLine();
        Address obj = new Address();
        if(obj.searchCity(map1, city) == null)
        {
            System.out.println("Searched city not found");
        }
        else 
        {
            List<Address> arr = obj.searchCity(map1, city);
            System.out.printf("%-15s %-15s %-15s %-15s %s\n", "Line 1", "Line 2", "City", "State", "Pincode");
            for(Address ad : arr)
            {
                System.out.printf("%-15s %-15s %-15s %-15s %s", ad.getLine1(), ad.getLine2(), ad.getCity(), ad.getState(), ad.getPincode());
                System.out.println();

            }
        }
    }
}
/*
4
22nd lane,RR nagar,Chennai,Tamil nadu,600028
3rd street,KRK nagar,Visak,Andhrapradesh,745601
1/45 8th street,KK nagar,Chennai,Tamil nadu,600021
5/15 7th lane,RK nagar,Madurai,Tamil nadu,625001
 */
