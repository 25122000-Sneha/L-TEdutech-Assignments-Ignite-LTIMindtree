package Phase2.Week_5.SetActivity.Q4;

public class User implements Comparable<User>{
	private String username;
	private String bankname;
	
	public User(){
	}

	public User(String username, String bankname) {
		super();
		this.username = username;
		this.bankname = bankname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	//fill the code here
	@Override
	public boolean equals(Object o)
	{
		if(o==this)
		{
			return true;
		}
		if(!(o instanceof User))
		{
			return false;
		}
		User obj = (User)o;
		return (this.username.compareTo(obj.username)==0);
	}
	
	@Override
	public int compareTo(User that)
	{
		return this.username.compareTo(that.username);
	}

}
