package Phase2.Week_5.MapActivity.Q10;
import java.util.*;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = reader.nextInt();
        reader.nextLine();
        TreeMap<String, Player> map = new TreeMap<String, Player>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of the player "+(i+1));
            String capNo = reader.nextLine();
            String name = reader.nextLine();
            String team = reader.nextLine();
            String skill = reader.nextLine();
            Player p = new Player(name, team, skill);
            map.put(capNo, p);
        }
        System.out.println("Player Details");
        for(Map.Entry<String,Player> e : map.entrySet())
        {
            Player obj = e.getValue();
            System.out.println(e.getKey()+"--"+obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());
        }
        System.out.println("Enter the cap number of the player to be searched");
        String searchCapNo = reader.nextLine();
        System.out.println("Player Details");
        if(map.containsKey(searchCapNo))
        {
            Player obj = map.get(searchCapNo);
            System.out.println(obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());
        }
        else 
        {
            System.out.println("Player not found");
        }
    }
}
