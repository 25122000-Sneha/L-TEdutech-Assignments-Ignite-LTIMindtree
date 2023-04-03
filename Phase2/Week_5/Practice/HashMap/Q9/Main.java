package Phase2.Week_5.Practice.HashMap.Q9;
import java.util.*;
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
        for(Map.Entry<String, Player> e : map.entrySet())
        {
            System.out.print(e.getKey());
            System.out.print("--"+e.getValue().getName()+"--"+e.getValue().getTeam()+"--"+e.getValue().getSkill()+"\n");

        }     
        System.out.println("Enter the cap number of the player to be searched");
        String capNo = reader.nextLine();
        System.out.println("Player Details");
        if(map.containsKey(capNo))
        {
            
            Player obj = map.get(capNo);
            System.out.print(obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());
        }      
        else 
        {
            System.out.println("Player not found");
        } 

    }
}
