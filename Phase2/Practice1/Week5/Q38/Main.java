package Phase2.Practice1.Week5.Q38;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the show:");
        int n = reader.nextInt();
        int[] arr = new int[n*n];
        int seatNo = 0;
        System.out.println("Enter the number of seats to be booked:");
        int seats = reader.nextInt();
        try
        {
            for(int i=0; i<seats; i++)
            {
                System.out.println("Enter the seat number "+(i+1));
                seatNo = reader.nextInt();
                if(arr[seatNo] == 0)
                {
                    arr[seatNo] = 1;
                }
                else 
                {
                    throw new SeatNotAvailableException("Already Booked");
                }
            }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getClass().getName()+": "+seatNo);
        }
        catch(SeatNotAvailableException e)
        {
            System.out.println(e);
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
