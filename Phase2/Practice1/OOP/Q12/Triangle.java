package Phase2.Practice1.OOP.Q12;

public class Triangle extends Shape{
    private double base, height;
    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override 
    public void computeArea()
    {
        area = (1/2.0)*base*height;
    }
}
