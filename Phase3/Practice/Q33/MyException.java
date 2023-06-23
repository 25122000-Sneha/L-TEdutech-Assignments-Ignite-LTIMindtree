package Phase3.Practice.Q33;

public class MyException  extends Exception{
    MyException(String msg)
    {
        super(msg);

    }
    MyException(String msg, Throwable throwable)
    {
        super(msg, throwable);
    }
    MyException(Throwable throwable)
    {
        super(throwable);
    }
    
}
