package Phase3.File_Handling.ReadFile;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        char[] data = new char[100];
        try 
        {
            FileReader input = new FileReader("data1.txt");
            input.read(data);
            System.out.println("Data received from a file:");
            System.out.println(data);
            input.close();
        }
        catch(IOException e)
        {
            System.out.println("File read error....");
        }
    }
}
