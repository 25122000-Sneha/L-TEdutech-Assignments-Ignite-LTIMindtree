package Foundation.Activities.ArrayAsObject.Q1;

public class User {
    private String name, mobileNumber, userName, password;
	public User(String n, String mn, String un, String p)
	{
		name = n;
		mobileNumber = mn;
		userName = un;
		password = p;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getPassword()
	{
		return password;
	}
}
