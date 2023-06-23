package Phase3.Week8.ChainedExceptionsDemo;
public class Demo1{
    public static int getValue() throws MyException
    {
        int a = 0;
        try 
        {
            a = 10/0;
        }
        catch(ArithmeticException e)
        { 
            throw new MyException("MyException occured", e);
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
            System.out.println("Caught: "+me.getMessage());
            System.out.println("Caused by: "+me.getCause());
            
        }
    }
}