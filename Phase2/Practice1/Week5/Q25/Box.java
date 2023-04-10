package Phase2.Practice1.Week5.Q25;

public class Box<T1,T2,T3>{
    T1 length;
    T2 width;
    T3 depth;
    Box(T1 length, T2 width, T3 depth)
    {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }
    public void print()
    {
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Depth : "+depth);
    }
}
