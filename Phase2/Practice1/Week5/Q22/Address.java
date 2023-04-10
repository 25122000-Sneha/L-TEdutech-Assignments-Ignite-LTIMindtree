package Phase2.Practice1.Week5.Q22;
import java.util.*;
public class Address {
    private String addressLine1, addressLine2, city, state;
    private Integer pincode;
    Address(){}
    Address(String addressLine1, String addressLine2, String city, String state, Integer pincode)
    {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Integer getPincode() {
        return pincode;
    }
    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
    Map<String, List<Address>> generateCityAddressMap(Map<String,List<Address>> cityAddressMap, Address address)
    {
        String city = address.city;
        if(cityAddressMap.containsKey(city))
        {
            List<Address> list = cityAddressMap.get(city);
            list.add(address);
            cityAddressMap.put(city, list);
        }
        else 
        {
            List<Address> list = new ArrayList<Address>();
            list.add(address);
            cityAddressMap.put(city, list);
        }
        return cityAddressMap;
    }
    
    List<Address> searchCity(Map<String, List<Address>> cityAddressMap, String city)
    {
        
        if(cityAddressMap.containsKey(city))
        {
            return cityAddressMap.get(city);
        }
        return cityAddressMap.get(city);
        

    }
}
