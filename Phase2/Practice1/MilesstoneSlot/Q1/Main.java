package Phase2.Practice1.MilesstoneSlot.Q1;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            arr.add(reader.nextInt());
        }

        int swap = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr.get(j) > arr.get(j+1))
                {
                    swap = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, swap);
                }
            }
            System.out.println(arr);
        }
        System.out.println("Final array:");
        System.out.println(arr);
    }
}