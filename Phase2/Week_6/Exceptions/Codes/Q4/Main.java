package Phase2.Week_6.Exceptions.Codes.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of seats to be booked:");
        int n = reader.nextInt();
        int[] arr = new int[100];
        int val = 0;
        try{
            for(int i=0; i<n; i++)
            {
                System.out.println("Enter the seat number "+(i+1));
                val = reader.nextInt();
                arr[val - 1] = val;
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
            System.out.println(e.getClass().getName()+": " +(val - 1));
        }
    }
}
