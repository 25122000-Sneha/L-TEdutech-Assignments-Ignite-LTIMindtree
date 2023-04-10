package Phase2.Practice1.Week5.Q24;

public class Player {
    private String name, team, skill;
    Player(String name, String team, String skill)
    {
        this.name = name;
        this.team = team;
        this.skill = skill;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setTeam(String team)
    {
        this.team = team;
    }
    public String getTeam()
    {
        return team;
    }
    public void setSkill(String skill)
    {
        this.skill = skill;
    }
    public String getSkill()
    {
        return skill;
    }
    
}
