package Phase2.Week_5.Practice.Generics;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        String[] arr = {"India", "China", "Britain", "Italy"};
        Arrays.sort(arr, null);
        for(String str : arr)
        {
            System.out.println(str);
        }
        
    }
}
