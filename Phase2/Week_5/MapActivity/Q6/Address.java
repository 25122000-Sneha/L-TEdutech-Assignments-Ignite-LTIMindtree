package Phase2.Week_5.MapActivity.Q6;
import java.util.*;
public class Address {
    private String line1, line2, city, state;
    private Integer pincode;
    Address(){}
    Address(String line1, String line2, String city, String state, Integer pincode)
    {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    public String getLine1() {
        return line1;
    }
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    public String getLine2() {
        return line2;
    }
    public void setLine2(String line2) {
        this.line2 = line2;
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
    public Map<String, List<Address>> generateCityAddressMap(Map<String,List<Address>> map, Address address)
    {
        String k = address.getCity();
        
        if(map.containsKey(k))
        {
            List<Address> arr = map.get(k);
            arr.add(address);
            map.put(k, arr);

        }
        else 
        {
            List<Address> arr = new ArrayList<Address>();
            arr.add(address);
            map.put(k, arr);
        }
        return map;
    }
    public List<Address> searchCity(Map<String, List<Address>> map, String city)
    {
        if(map.containsKey(city))
        {
            
            return map.get(city);
        }
        return map.get(city);

        
        
        
    }
    
}
