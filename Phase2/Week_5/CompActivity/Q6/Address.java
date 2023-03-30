package Phase2.Week_5.CompActivity.Q6;

public class Address implements Comparable<Address>{
    private String username, addessLine1, addressLine2;
    private int pinCode;
    Address(){}
    
    
    @Override
    public int compareTo(Address that)
    {
        if(Integer.compare(this.getPinCode(), that.pinCode) == 0)
        {
            return this.getAddessLine1().compareTo(that.getAddessLine1());
        }
        return Integer.compare(this.getPinCode(), that.getPinCode());
    }


    public Address(String username, String addessLine1, String addressLine2, int pinCode) {
        this.username = username;
        this.addessLine1 = addessLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String userName) {
        this.username = userName;
    }


    public String getAddessLine1() {
        return addessLine1;
    }


    public void setAddessLine1(String addessLine1) {
        this.addessLine1 = addessLine1;
    }


    public String getAddressLine2() {
        return addressLine2;
    }


    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    public int getPinCode() {
        return pinCode;
    }


    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    
    
}
