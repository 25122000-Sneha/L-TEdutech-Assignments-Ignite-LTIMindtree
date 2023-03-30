package Phase2.Week_5.Generics.Q1;
import java.util.*;
public class Main{
    public static <E> void printArray(E[] elems)
    {
        Arrays.sort(elems);
        for(E each : elems)
        {
            System.out.println(each);
        }

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter n");
        int n = reader.nextInt();
        System.out.println("Enter integers one by one");
        Integer[] arr = new Integer[n];
        Double[] darr = new Double[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();

        }
        System.out.println("Enter double values one by one");
        for(int i=0; i<n; i++)
        {
            darr[i] = reader.nextDouble();
        }
        
        System.out.println("Printing Integer Array");
        printArray(arr);
        System.out.println("Printing Double Array");
        printArray(darr);
    }
}
