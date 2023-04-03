package Phase2.Week_6.Exceptions.Codes.Q5;
import java.util.*;

public class ContactDetail {
    private String mobileNumber;
	private	String alternateMobileNumber;
	private	String landline;
	private	String email;
	private String address;
	
	public ContactDetail(String mobileNumber, String alternateMobileNumber, String landline, String email, String address) {
		this.mobileNumber = mobileNumber;
		this.alternateMobileNumber = alternateMobileNumber;
		this.landline = landline;
		this.email = email;
		this.address = address;
	}
	public ContactDetail() {
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getLandline() {
		return landline;
	}
	public void setLandline(String landline) {
		this.landline = landline;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    public String toString() {
        //fill your code here
		String output = "Mobile:"+mobileNumber+"\nAlternate mobile:"+alternateMobileNumber+"\nLandLine:"+landline+"\nEmail:"+email+"\nAddress:"+address;
        return output;
    }
}
