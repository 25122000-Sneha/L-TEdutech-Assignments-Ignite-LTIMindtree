package Phase2.Week_5.MapActivity.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashMap<String, ArrayList<Wicket>> map = new HashMap<String, ArrayList<Wicket>>();
        do
        {
            System.out.println("Enter the player name");
            String playerName = reader.nextLine();
            System.out.println("Enter wickets - seperated by \"|\" symbol");
            String wicketNames = reader.nextLine();
            String[] wicketArr = wicketNames.split("[|]");
            for(String each : wicketArr)
            {
                Bowler bowler = new Bowler(each);
                Wicket wicket = new Wicket(playerName, bowler);
            }


        }
    }
}
