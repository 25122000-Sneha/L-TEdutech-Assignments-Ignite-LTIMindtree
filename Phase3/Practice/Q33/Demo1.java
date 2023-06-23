package Phase3.Practice.Q33;

public class Demo1 {
    public static int getValue() throws MyException
    {
        int a = 0;
        try
        {
            a = 5/0;
        }
        catch(ArithmeticException e)
        {
            MyException ex = new MyException("MyException occured");
            ex.initCause(e);
            throw ex;
        }
        return a;
    }
    public static void main(String[] args)
    {
        try 
        {
            int a = getValue();
            System.out.println(a);
        }
        catch(MyException me)
        {
            System.out.println("Caught : "+me.getMessage());
            System.out.println("Caused by :"+me.getCause());
        }
    }

    /*
    public static int getValue() throws MyException
    {
        int a = 0;
        try
        {
            a = 5/0;
        }
        catch(ArithmeticException e)
        {
            throw new MyException("MyException occured....", e);
        }
        return a;
    }
    public static void main(String[] args)
    {
        try 
        {
            int a = getValue();
            System.out.println(a);
        }
        catch(MyException ex)
        {
            System.out.println("Caught : "+ex.getMessage());
            System.out.println("Caused by : "+ex.getCause());
        }
    }*/
}

