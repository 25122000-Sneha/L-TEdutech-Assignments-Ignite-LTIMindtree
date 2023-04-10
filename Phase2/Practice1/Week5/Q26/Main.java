package Phase2.Practice1.Week5.Q26;
import java.util.*;
public class Main {
    public static<E> void printArray(E[] elements)
    {
        Arrays.sort(elements);
        for(E each : elements)
        {
            System.out.println(each);
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter n");
        int n = reader.nextInt();
        Integer[] arr1 = new Integer[n]; 
        System.out.println("Enter integers one by one");
        for(int i=0; i<n; i++)
        {
            arr1[i] = reader.nextInt();
        }
        Double[] arr2 = new Double[n];
        System.out.println("Enter double values one by one");
        for(int i=0; i<n; i++)
        {
            arr2[i] = reader.nextDouble();
        }
        System.out.println("Printing Integer Array");
        printArray(arr1);
        System.out.println("Printing Double Array");
        printArray(arr2);
    }
}
