package Phase2.Week_5.Generics.Q3;

public class Contact<T1, U1> {
    private T1 email;
    private U1 phoneNo;
    Contact(T1 email, U1 phoneNo)
    {
        this.email = email;
        this.phoneNo = phoneNo;
    }
    public void setEmail(T1 email)
    {
        this.email = email;
    }
    public T1 getEmail()
    {
        return this.email;
    }
    public void setPhoneNo(U1 phoneNo)
    {
        this.phoneNo = phoneNo;
    }
    public U1 getPhoneNo()
    {
        return this.phoneNo;
    }
    void print()
    {
        
    }
}
