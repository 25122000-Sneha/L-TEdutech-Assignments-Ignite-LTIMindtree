package Phase2.PythonBasics.Activity.OverridingPolyActivity.Q5;

public class Circle extends Shape{
    private Double radius;
    
    public Circle()
    {
    }
    public Circle(Double radius)
    {
        this.radius=radius;
    }
     public void setRadius(Double radius)
    {
        this.radius=radius;
    }
    public Double getRadius()
    {
        return this.radius;
    }
    

   public void computeArea()
    {
       // fill the code
       area = (22/7)*radius*radius;
    }
}
