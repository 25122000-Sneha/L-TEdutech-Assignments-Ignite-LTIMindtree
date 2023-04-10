package Phase2.Practice1.Week5.Q24;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = Integer.parseInt(reader.nextLine());
        TreeMap<Integer, Player> map = new TreeMap<Integer, Player>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of the player "+(i+1));
            int capNo = Integer.parseInt(reader.nextLine());
            String name = reader.nextLine();
            String team = reader.nextLine();
            String skill = reader.nextLine();
            Player p = new Player(name, team, skill);
            map.put(capNo, p);
        }
        System.out.println("Player Details");
        for(Map.Entry<Integer, Player> e : map.entrySet())
        {
            Player obj = e.getValue();
            System.out.println(e.getKey()+"--"+obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());
        }

        System.out.println("Enter the cap number of the player to be searched");
        int searchCapNo = Integer.parseInt(reader.nextLine());
        System.out.println("Player Details");
        if(map.containsKey(searchCapNo))
        {
            Player obj = map.get(searchCapNo);
            System.out.println(searchCapNo+"--"+obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());
        }
        else 
        {
            System.out.println("Player not found");
        }
    }
}
