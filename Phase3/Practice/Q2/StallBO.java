package Phase3.Practice.Q2;
import java.io.*;
public class StallBO {
    public Stall readStallFromFile() throws IOException
    {
        String detail = "";
        FileReader input = new FileReader("D:\\Internship\\Phase3\\Practice\\Q2\\input.txt");
        int data;
        while((data=input.read())!=-1)
        {
            detail += (char)data;
        }
        
        String[] detailArr = detail.split(",");
        Stall obj = new Stall(detailArr[0], detailArr[1], detailArr[2]);
        input.close();
        return obj;
    }

    public void display(Stall stall)
    {
        System.out.println("Name: "+stall.getName());
        System.out.println("Category: "+stall.getCategory());
        System.out.println("Ower: "+stall.getOwner());
    }
}
