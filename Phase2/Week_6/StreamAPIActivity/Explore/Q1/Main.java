package Phase2.Week_6.StreamAPIActivity.Explore.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        int result = 1;
        
        Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
        
        System.out.println("doubling " + i++);
        
        result *=i;
        
        return result;
        
        });
        
        System.out.println(result);
        
        }
}
