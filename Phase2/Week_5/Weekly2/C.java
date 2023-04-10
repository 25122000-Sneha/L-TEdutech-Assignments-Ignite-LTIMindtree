package Phase2.Week_5.Weekly2;
class A 
{
    int a = 2;
    int getA()
    {
        return a;
    }
}
class B 
{
    int b = 5;
    void setB()
    {
        A objA = new A();
        b = objA.getA();
    }
    int getB()
    {
        return b;
    }
}

public class C {
    public static void main(String[] args) {
        B obj = new B();
        obj.setB();
        System.out.println(obj.getB());
    }
}
