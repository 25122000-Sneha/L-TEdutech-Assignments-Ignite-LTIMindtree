package Phase3.Week7.Practice.Q2;
import java.io.*;
public class StallBO {
    public Stall readStallFromFile()
    {   
        Stall obj = new Stall();
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Internship\\Phase3\\Week7\\Practice\\Q2\\input.txt"));
            String str;
            while((str = br.readLine())!=null)
            {
                //System.out.println(str);
                String[] detailArr = str.split(",");
                obj = new Stall(detailArr[0], detailArr[1], detailArr[2]);

            }
            
            br.close();
            
        }
        catch(IOException e)
        {
            System.out.println("File read error....");
        }
        return obj;

    }

    public void display(Stall stall)
    {
        System.out.println("Name: "+stall.getName());
        System.out.println("Category: "+stall.getCategory());
        System.out.println("Owner: "+stall.getOwner());
    }
}
