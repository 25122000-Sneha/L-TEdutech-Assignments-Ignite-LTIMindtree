package Phase2.Practice1.Week5.Q25;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the values for length, width and depth : ");
        int l = reader.nextInt();
        int w = reader.nextInt();
        int d = reader.nextInt();
        Box<Integer,Integer,Integer> obj = new Box<Integer,Integer,Integer>(l, w, d);
        obj.print();

    }
}
