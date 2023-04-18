package Phase3.Week7.File_Handling.AppendToFile;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String data = "This data is appended.....";
        try
        {
            FileWriter output = new FileWriter("data1.txt", true);
            output.write(data);
            System.out.println("data appended successfully");
            output.close();
        }
        catch(IOException ex)
        {
            System.out.println("File append error....");
        }
    }
}
