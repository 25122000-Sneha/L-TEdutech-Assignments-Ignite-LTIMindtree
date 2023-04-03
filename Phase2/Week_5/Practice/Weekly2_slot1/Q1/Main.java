//reverse an arraylist in place starting from end
package Phase2.Week_5.Practice.Weekly2_slot1.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            arr.add(reader.nextInt());
        }
        int j = arr.size()-1;
        int swap = 0;
        for(int i=0; i<=(arr.size()-1)/2; i++)
        {
            swap = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, swap);
            j--;
            System.out.println(arr);
        }

    }
}
