package Phase2.Week_6.LambdaExpActivity.Q3;

public class User implements Comparable<User>{
    private String name, mobileNumber, userName, password;
    User(String name, String mobileNumber, String userName, String password)
    {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userName = userName;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString()
    {
        return String.format("%-15s%-15s", this.name, this.mobileNumber);
    }
    @Override 
    public int compareTo(User that)
    {
        return this.name.compareTo(that.name);
    }
}
