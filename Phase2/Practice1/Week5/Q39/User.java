package Phase2.Practice1.Week5.Q39;

public class User{
    private String name, mobile, username, password;
    User(String name, String mobile, String username, String password)
    {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        return "Name:"+this.name+"\nMobile:"+this.mobile+"\nUsername:"+this.username+"\nPassword:"+this.password;
    }
}
