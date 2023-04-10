package Phase2.Practice1.OOP.Q12;

public class Circle extends Shape{
    private double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    @Override
    public void computeArea()
    {
        area = (22/7.0)*radius*radius;
    }
}
