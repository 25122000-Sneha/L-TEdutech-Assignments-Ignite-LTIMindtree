package Phase2.Practice1.Week5.Q42;
import java.util.*;
class Hall implements Comparable<Hall>{
    private String name, owner;
    private Double costPerDay;
    Hall(String name, Double costPerDay, String owner)
    {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public Double getCostPerDay() {
        return costPerDay;
    }
    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
    public String toString()
    {
        return String.format("%-15s %-10s %s", this.name, this.costPerDay, this.owner);
    }
    @Override 
    public int compareTo(Hall that)
    {
        return this.name.compareTo(that.name);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no of halls:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<Hall> arr = new ArrayList<Hall>();
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Hall obj = new Hall(detailArr[0], Double.parseDouble(detailArr[1]), detailArr[2]);
            arr.add(obj);
        }
        Collections.sort(arr);
        System.out.printf("%-15s %-10s %s\n", "Name", "Cost", "Owner");
        
        for(Hall h : arr)
        {
            System.out.println(h);
        }

    }
}

