package Foundation.Activities.Assessment1.Weekly2;
import java.util.*;
public class Test2 {
    public static int[] doubledArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i]*2;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int[] doubledNumbers = doubledArray(numbers);
        System.out.println(Arrays.toString(doubledNumbers));
    }
}
