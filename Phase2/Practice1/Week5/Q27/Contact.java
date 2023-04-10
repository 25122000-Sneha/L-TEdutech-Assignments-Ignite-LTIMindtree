package Phase2.Practice1.Week5.Q27;

public class Contact<T1,U1>
{
    private T1 _att1;
    private U1 _att2;
    Contact(T1 _att1, U1 _att2)
    {
        this._att1 = _att1;
        this._att2 = _att2;
    }
    public void setAtt1(T1 _att1)
    {
        this._att1 = _att1;
    }
    public T1 getatt1()
    {
        return _att1;
    }
    public void setAtt2(U1 _att2)
    {
        this._att2 = _att2;
    }
    public U1 getAtt2()
    {
        return _att2;
    }

    void print()
    {
        System.out.println(this._att1);   
    }
}
