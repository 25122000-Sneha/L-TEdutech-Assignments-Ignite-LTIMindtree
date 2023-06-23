package Phase3.NeoPractice.Exceptions.Q3;

// You are using Java
import java.util.*;
class IndexError extends Exception
{
    IndexError(String str)
    {
        super(str);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        try 
        {
            while(reader.hasNextInt())
            {
                arr.add(reader.nextInt());
            }
            if(arr.size()<n)
            {
                throw new IndexError("list index out of range");
            }
            else 
            {
                int sum = 0;
                for(int i=0; i<n; i++)
                {
                    sum += arr.get(i);
                }
                System.out.println(sum);
            }
        }
        catch(IndexError e)
        {
            System.out.println(e.getMessage());
        }
    }
}