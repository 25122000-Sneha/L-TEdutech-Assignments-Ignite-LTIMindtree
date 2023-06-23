package Phase3.Practice.Q4;
import java.io.*;
import java.util.*;
public class EventBO {
    public void saveToFile(List<Event> eventList) throws IOException 
    {
        BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\Practice\\Q4\\event.txt"));
        br.write("Event details:\n");
        for(Event e : eventList)
        {
            br.write(e.getName()+","+e.getDetails()+","+e.getManager()+"\n");
        }
        br.close();
    }
}
