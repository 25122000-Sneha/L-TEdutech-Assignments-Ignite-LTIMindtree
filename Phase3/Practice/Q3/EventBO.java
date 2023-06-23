package Phase3.Practice.Q3;
import java.io.*;
public class EventBO {
    public void saveToFile(Event event) throws IOException
    {
        FileWriter output = new FileWriter("D:\\Internship\\Phase3\\Practice\\Q3\\event.txt");
        output.write("Event details\n");
        output.write("Event name:"+event.getName()+"\n");
        output.write("Event details:"+event.getDetails()+"\n");
        output.write("Event manager:"+event.getManager());
        output.close();
    }
}
