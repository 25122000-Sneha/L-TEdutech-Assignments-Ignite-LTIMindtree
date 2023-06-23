package Phase3.NeoPractice.Exceptions.Q2;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean seatArr[] = new boolean[50];
        
        int  numSeats = Integer.valueOf(scan.nextLine());
        try{
            int[] seats = new int[50];
            for(int i=0; i<numSeats; i++)
            {
                int seatNo = scan.nextInt();
                int index = seatNo - 1;
                seatArr[index] = true;
                seats[index] = seatNo;
            }
            for(int i=0; i<50; i++)
            {
                if(seatArr[i]==true)
                {
                    System.out.println(seats[i]);
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException: "+e.getMessage());
                        
        }
    }
}