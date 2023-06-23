package Phase3.Practice.Q3;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the event name");
        String n = reader.nextLine();
        System.out.println("Enter event details");
        String d = reader.nextLine();
        System.out.println("Enter the event manager");
        String m = reader.nextLine();
        Event obj = new Event(n, d, m);

        EventBO ebo = new EventBO();
        try
        {
            ebo.saveToFile(obj);
            System.out.println("File wrote successfully....");
        }
        catch(IOException e)
        {
            System.out.println("File Write Error....");
        }
    }
}
