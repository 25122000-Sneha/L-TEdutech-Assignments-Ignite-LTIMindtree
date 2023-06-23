package Phase3.Practice.Q36;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int[] arr = new int[100];

        System.out.println("Enter the no of seats to be booked:");
        int n = reader.nextInt();
        int seatNo = 0;
        try 
        {
            for(int i=0; i<n; i++)
            {
                System.out.println("Enter the seat number "+(i+1));
                seatNo = reader.nextInt();
                arr[seatNo - 1] = seatNo;
            }
            System.out.println("The seats booked are:");
            for(int i=0; i<100; i++)
            {
                if(arr[i]!=0)
                {
                    System.out.println(arr[i]);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException:"+(seatNo-1));
        }
    }
}
