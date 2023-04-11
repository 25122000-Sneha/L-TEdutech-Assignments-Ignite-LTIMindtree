package Phase3.WorkingWithTextFilesActivity.Q3;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the event name");
        String name = reader.nextLine();
        System.out.println("Enter the event details");
        String details = reader.nextLine();
        System.out.println("Enter the event manager");
        String manager = reader.nextLine();
        Event obj = new Event(name, details, manager);
        EventBO ebo = new EventBO();
        try 
        {
            ebo.saveToFile(obj);
            System.out.println("Saved to event.txt successfully");
        }
        catch(IOException e)
        {
            System.out.println("Write error....");
        }
    }
    
}
