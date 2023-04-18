package JDBCActivityQ2;

public class User {
	private Long id;
	private String name, contactDetail, username, password;
	
	User(){}
	User(Long id, String name, String contactDetail, String username, String password)
	{
		this.id = id;
		this.name = name;
		this.contactDetail = contactDetail;
		this.username = username;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactDetail() {
		return contactDetail;
	}
	public void setContactDetail(String contactDetail) {
		this.contactDetail = contactDetail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
		return String.format("%-5s %-5s %-15s %-10s %s", this.id, this.name, this.contactDetail, this.username, this.password);
	}
	
}
