package Phase2.Practice1.Week5.Q21;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++)
        {
            int id = reader.nextInt();
            int marks = reader.nextInt();
            map.put(id, marks);
        }
        UserMainCode.findPass(map);
    }
}
