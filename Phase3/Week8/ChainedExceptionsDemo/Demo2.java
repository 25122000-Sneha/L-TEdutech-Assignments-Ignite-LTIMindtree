package Phase3.Week8.ChainedExceptionsDemo;

public class Demo2 {
    public static int getValue() throws MyException
    {
        int a = 0;
        try 
        {
            a = 10/0;
        }
        catch(ArithmeticException e)
        { 
            MyException myException = new MyException("MyException occured....");
            myException.initCause(e);
            throw myException;
        }
        return a;
    }
    public static void main(String[] args) {
        try 
        {
            int a = getValue();
            System.out.println(a);
        }
        catch(MyException me)
        {
            System.out.println(me);
            System.out.println("Caused by :"+me.getCause());
            
        }
    }
}
