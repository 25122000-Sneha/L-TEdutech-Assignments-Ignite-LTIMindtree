package Phase2.Week_6.Exceptions.Codes.Q6;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the show:");
        int n = Integer.parseInt(reader.nextLine());
        int[] arr = new int[n*n];
        System.out.println("Enter the number of seats to be booked:");
        int noOfSeats = Integer.parseInt(reader.nextLine());
        int seatNo = 0;
        try{
            for(int i=0; i<noOfSeats; i++)
            {
                System.out.println("Enter the seat number "+(i+1));
                seatNo = Integer.parseInt(reader.nextLine());
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
            System.out.println(e.getClass().getName()+": "+seatNo);
        }
        catch(SeatNotAvailableException e)
        {
            System.out.println(e.getClass().getName()+": "+e.getMessage());
        } 
            

        

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
