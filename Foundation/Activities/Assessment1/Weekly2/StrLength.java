package Foundation.Activities.Assessment1.Weekly2;
import java.util.*;
public class StrLength {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        String[] arr = new String[n];
        String temp ="";
        for(int i=0; i<n; i++)
        {
            //reader.nextLine();
            arr[i] = reader.next();
        }
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j].length() > arr[j+1].length())
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
