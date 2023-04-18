package Phase3.Week7.WorkingWithTextFilesActivity.Q2;
import java.io.*;
import java.util.*;
public class StallBO {
    public Stall readStallFromFile() throws IOException
    {
        File f = new File("D:\\Internship\\Phase3\\WorkingWithTextFilesActivity\\Q2\\input.txt");
        String detail;
        String[] detailArr;
        Stall obj = new Stall();
        
        Scanner reader = new Scanner(f);
        while(reader.hasNextLine())
        {
            detail = reader.nextLine();
            detailArr = detail.split("[,]");
            obj = new Stall(detailArr[0], detailArr[1], detailArr[2]);
            
        }
        reader.close();
        return obj;

    }

    public void display(Stall stall)
    {
        System.out.println("Name: "+stall.getName());
        System.out.println("Category: "+stall.getCategory());
        System.out.println("Owner: "+stall.getOwner());
    }
}
