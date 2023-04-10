package Phase2.Practice1.Week5.Q37;

public class ContactDetail {
    private String mobNo, altMobNo, landline, email, address;
    ContactDetail(String mobNo, String altMobNo, String landline, String email, String address)
    {
        this.mobNo = mobNo;
        this.altMobNo = altMobNo;
        this.landline = landline;
        this.email = email;
        this.address = address;
    }
    public String getMobNo() {
        return mobNo;
    }
    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
    public String getAltMobNo() {
        return altMobNo;
    }
    public void setAltMobNo(String altMobNo) {
        this.altMobNo = altMobNo;
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
    public String toString()
    {
        return "Mobile:"+this.mobNo+"\nAlternate mobile:"+this.altMobNo+"\nLandLine:"+this.landline+"\nEmail:"+this.email+"\nAddress:"+this.address;
    }
}
