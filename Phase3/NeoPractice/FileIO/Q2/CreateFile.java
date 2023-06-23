package Phase3.NeoPractice.FileIO.Q2;

// You are using Java
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
class CreateFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine();
        String str2 = reader.nextLine();
        FileWriting.writeAndRead(str1, str2);
    }
}

class FileWriting 
{
    public static void writeAndRead(String str1, String str2)
    {
        try
        {
            FileWriter fw = new FileWriter("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q2\\sample.txt");
            fw.write(str1+"\n");
            fw.write(str2);
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("File write error....");
        }
        try
        {
            FileReader fr = new FileReader("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q2\\sample.txt");
            int data;
            while((data=fr.read())!=-1)
            {
                System.out.print((char)data);
            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File Read Error....");
        }
        
    }
}

/*
Hi my name is Rita.
I like Ice cream and chips
 */