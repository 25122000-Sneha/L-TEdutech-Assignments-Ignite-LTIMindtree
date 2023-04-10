package Phase2.Practice1.Week5.Q18;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the no. of airports");
        int n = Integer.parseInt(reader.nextLine());
        TreeMap<String, Airport> map = new TreeMap<String, Airport>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of the airport "+(i+1));
            String code = reader.nextLine();
            String name = reader.nextLine();
            String city = reader.nextLine();
            Airport obj = new Airport(code, name, city);
            map.put(code, obj);

        }
        System.out.println("Airport Details");
        for(Map.Entry<String,Airport> e : map.entrySet())
        {
            Airport obj = e.getValue();
            System.out.println(e.getKey()+"--"+obj.getName()+"--"+obj.getCity());

        }
    }
}
