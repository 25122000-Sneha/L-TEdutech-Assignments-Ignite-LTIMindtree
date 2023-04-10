package Phase2.Practice1.Week5.Q36;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] seatArr = new int[100];
        System.out.println("Enter number of seats to be booked:");
        int n = reader.nextInt();
        int seatNo = 0;
        try
        {
            for(int i=0; i<n; i++)
            {
                System.out.println("Enter seat numbder "+(i+1));
                seatNo = reader.nextInt();
                seatArr[seatNo - 1] = seatNo;
            }
            System.out.println("The seats booked are:");
            for(int i=0; i<100; i++)
            {
                if(seatArr[i] != 0)
                {
                    System.out.println(seatArr[i]);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getClass().getName()+":"+(seatNo-1));
        }
    }
}
