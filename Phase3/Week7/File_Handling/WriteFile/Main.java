package Phase3.Week7.File_Handling.WriteFile;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String data = "101, K Patel, Ahmedabad, Gujarat, India";
        try 
        {
            FileWriter output = new FileWriter("data1.txt");
            output.write(data);
            System.out.println("Data is written successfully");
            output.close(); //vv imp 
        }
        catch(IOException e)
        {
            System.out.println("File Write Error....");
        }
    }
}
