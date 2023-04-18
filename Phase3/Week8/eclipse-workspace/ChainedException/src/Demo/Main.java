package Demo;

public class Main {
	public static int getValue() throws MyException
    {
        int a = 0;
        try 
        {
            a = 10/0;
        }
        catch(ArithmeticException e)
        { 
            MyException myException = new MyException(e);
            throw myException;
        }
        return a;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
        {
            int a = getValue();
            System.out.println(a);
        }
        catch(MyException me)
        {
            System.out.println("Cause = "+me.getCause());
            System.out.println("Message = "+me.getMessage());
        }

	}

}
