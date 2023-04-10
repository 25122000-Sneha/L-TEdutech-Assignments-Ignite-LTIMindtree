package Phase2.Week_5.MapActivity.Q5;

public class Wicket {
    private String playerName;
    private Bowler bowler;
    Wicket(String playerName, Bowler bowler)
    {
        this.playerName = playerName;
        this.bowler = bowler;
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public Bowler getBowler() {
        return bowler;
    }
    public void setBowler(Bowler bowler) {
        this.bowler = bowler;
    }
    
}
