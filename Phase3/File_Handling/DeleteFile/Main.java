package Phase3.File_Handling.DeleteFile;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        File myFile = new File("data2.txt");
        if(myFile.delete())
        {
            System.out.println("File deleted: "+myFile.getName()+" successfully");

        }
        else 
        {
            System.out.println("failed to delete a file");
        }
    }
}
