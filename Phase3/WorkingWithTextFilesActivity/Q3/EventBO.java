package Phase3.WorkingWithTextFilesActivity.Q3;
import java.io.*;
public class EventBO {
    public void saveToFile(Event event) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\WorkingWithTextFilesActivity\\Q3\\event.txt"));
        writer.write("Event details");
        writer.write("\nEvent name:"+event.getName());
        writer.write("\nEvent details:"+event.getDetails());
        writer.write("\nEvent manager:"+event.getManager());
        writer.close();
    }
}
