package Phase2.Practice1.OOP.Q12;

public class Rectangle extends Shape{
    private double length, breadth;
    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public void setLength(double l)
    {
        this.length = l;
    }
    public double getLength()
    {
        return length;
    }
    public void setBreadth(double b)
    {
        this.breadth = breadth;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public void computeArea()
    {
        area = length*breadth;
    }
}
