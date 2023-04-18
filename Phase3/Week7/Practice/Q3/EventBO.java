package Phase3.Week7.Practice.Q3;
import java.io.*;
public class EventBO {
    public void saveToFile(Event event)
    {
        try 
        {
            BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\Week7\\Practice\\Q3\\event.txt"));
            br.write("Event details");
            br.write("\nEvent name:"+event.getName());
            br.write("\nEvent details:"+event.getDetails());
            br.write("\nEvent manager:"+event.getManager());
            System.out.println("Data written successfully!!");
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File write error ....");
        }
    }
}
