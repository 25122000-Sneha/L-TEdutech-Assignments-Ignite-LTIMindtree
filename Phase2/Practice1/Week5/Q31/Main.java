package Phase2.Practice1.Week5.Q31;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = reader.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        System.out.println("Enter the index of the array element you want to access");
        int index = reader.nextInt();
        try
        {
            System.out.println("The array element at index "+index+" = "+arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
    }
}
