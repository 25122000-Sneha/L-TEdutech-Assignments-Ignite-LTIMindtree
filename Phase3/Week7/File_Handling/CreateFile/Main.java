package Phase3.Week7.File_Handling.CreateFile;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        File myFile = new File("data1.txt");
        try
        {
            if(myFile.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else 
            {
                System.out.println("File creation error");
            }
        }
        catch(IOException ex)
        {
            System.out.println("File error....");
        }
    }
}
