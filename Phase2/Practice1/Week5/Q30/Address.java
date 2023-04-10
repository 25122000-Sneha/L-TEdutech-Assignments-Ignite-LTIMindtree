package Phase2.Practice1.Week5.Q30;

public class Address implements Comparable<Address>{
    private String username, addressLine1, addressLine2;
    Integer pinCode;
    Address(String username, String addressLine1, String addressLine2, Integer pinCode)
    {
        this.username = username;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }
    Address(){}
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
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
    public Integer getPinCode() {
        return pinCode;
    }
    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }
    @Override 
    public int compareTo(Address that)
    {
        if(Integer.compare(this.pinCode, that.pinCode)==0)
        {
            return this.addressLine1.compareTo(that.addressLine1);
        }
        return Integer.compare(this.pinCode, that.pinCode);
    }    
    @Override 
    public String toString()
    {
        return this.username+","+this.addressLine1+","+this.addressLine2+","+this.pinCode;
    }
}
