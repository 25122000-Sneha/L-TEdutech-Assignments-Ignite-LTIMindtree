package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q4;


class Exhibition extends Event{
    Integer noOfStalls;
    Exhibition(String name, String detail, String ownerName, Integer noOfStalls)
    {
        super(name, detail, ownerName);
        this.noOfStalls = noOfStalls;
    }

  public double projectedRevenue()
  {
      double revenue = noOfStalls * 10000.0;
      return revenue;
  }
}
