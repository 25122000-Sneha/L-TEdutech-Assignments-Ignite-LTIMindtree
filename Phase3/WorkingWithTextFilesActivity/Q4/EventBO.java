package Phase3.WorkingWithTextFilesActivity.Q4;
import java.io.*;
import java.util.*;
public class EventBO {
    public void saveToFile(List<Event> eventList) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\WorkingWithTextFilesActivity\\Q4\\event.txt"));
        writer.write("Event details:\n");
        for(Event event : eventList)
        {
            String detail = event.getName()+","+event.getDetails()+","+event.getManager();
            writer.write(detail);
            writer.write("\n");
        }
        writer.close();

    }
}
