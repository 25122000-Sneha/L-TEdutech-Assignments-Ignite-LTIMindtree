package Phase3.Week7.Practice.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        StallBO sbo = new StallBO();
        Stall obj = sbo.readStallFromFile();
        sbo.display(obj);
    }
}
