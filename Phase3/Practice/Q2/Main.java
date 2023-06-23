package Phase3.Practice.Q2;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        StallBO sbo = new StallBO();
        try
        {
            Stall obj = sbo.readStallFromFile();
            sbo.display(obj);
        }
        catch(IOException e)
        {
            System.out.println("File read Error....");
        }

    }
}
