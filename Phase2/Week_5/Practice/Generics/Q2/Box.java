package Phase2.Week_5.Practice.Generics.Q2;

public class Box <T1, T2, T3> {
    T1 length;
    T2 width;
    T3 depth;
    Box(T1 length, T2 width, T3 depth)
    {
        this.length = length;
        this.width = width;
        this.depth = depth;
    }
    void print()
    {
        System.out.println("Length : "+length);
        System.out.println("Width : "+width);
        System.out.println("Depth : "+depth);
    }
}
