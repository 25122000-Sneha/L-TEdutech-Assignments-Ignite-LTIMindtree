package Phase2.Week_5.Weekly2.Slot2.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        map.put("anil", 56);
        map.put("dhoni", 78);
        map.put("kohli", 28);
        map.put("ajay", 45);
        System.out.println("Size of map is: "+map.size());
        System.out.println("Content of map is: "+map);
        
        if(map.containsKey(name))
        {
            System.out.println("True");
            System.out.println("Score of "+name+" is "+map.get(name));
        }
        else 
        {
            System.out.println("False");
        }



    }
}
