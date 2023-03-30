package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q4;

class StageEvent extends Event{
    Integer noOfShows, noOfSeatsPerRow;
    StageEvent(String name, String detail, String ownerName, Integer noOfShows, Integer noOfSeatsPerRow)
    {
        super(name, detail, ownerName);
        this.noOfShows = noOfShows;
        this.noOfSeatsPerRow = noOfSeatsPerRow;
    }
    public double projectedRevenue()
    {
        double revenue = noOfShows * noOfSeatsPerRow * 50.0;
        return revenue;
    }
}
