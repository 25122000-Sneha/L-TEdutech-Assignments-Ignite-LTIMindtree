package Phase3.Week7.Practice.Q4;
import java.io.*;
import java.util.*;
class EventBO{
    public void saveToFile(List<Event> eventList)
    {
        try 
        {
            BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\Week7\\Practice\\Q4\\event.txt"));
            br.write("Event details\n");
            for(Event obj : eventList)
            {
                br.write(obj.getName()+","+obj.getDetails()+","+obj.getManager());
                br.write("\n");
            }
            System.out.println("File written successfully!!");
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File write error....");
        }
    }
}