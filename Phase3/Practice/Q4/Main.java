package Phase3.Practice.Q4;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no. of events");
        int n = Integer.parseInt(reader.nextLine());
        
        List<Event> list = new ArrayList<Event>();
        System.out.println("Enter event details in format(name,details,manager name)");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Event obj = new Event(detailArr[0], detailArr[1], detailArr[2]);
            list.add(obj);
        }
        EventBO ebo = new EventBO();
        try 
        {
            ebo.saveToFile(list);
            System.out.println("File wrote success");
        }
        catch(IOException e)
        {
            System.out.println("File Write Error....");
        }
    }
}
