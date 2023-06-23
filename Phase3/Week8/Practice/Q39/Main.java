package Phase3.Week8.Practice.Q39;
import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the no of rows and columns of the show:");
        int n = reader.nextInt();
        int[] arr = new int[n*n];
        System.out.println("Enter no of seats to be booked:");
        int seats = reader.nextInt();
        int seatNo = 0;
        try 
        {
            for(int i=0; i<seats; i++)
            {
                System.out.println("Enter the seat number "+(i+1));
                seatNo = reader.nextInt();
                if(arr[seatNo] == 1)
                {
                    throw new SeatNotAvailableException("Already Booked");
                }
                else 
                {
                    arr[seatNo] = 1;
                }
                
            }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException: "+seatNo);
        }
        catch(SeatNotAvailableException e)
        {
            System.out.println("SeatNotAvailableException: "+e.getMessage());
        }
        finally
        {
            System.out.println("The seats booked are:");
            int k = 0;
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    System.out.print(arr[k]+" ");
                    k++;
                }
                System.out.println();
            }
        }
    }
}