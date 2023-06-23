package Phase3.NeoPractice.FileIO.Q4;
// You are using Java
import java.io.*;
import java.util.*;
public class Sample {
   public static void main(String args[]) throws Exception{
       // Type your code here
       Scanner reader = new Scanner(System.in);
       String str = reader.nextLine();
       try
       {
           File myFile = new File("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q4\\sample.txt");
           boolean res = myFile.createNewFile();
           if(res == false)
           {
               System.out.println("File create error....");
           }
       }
       catch(IOException e)
       {
           System.out.println("File error....");
       }
       CountDigits.countDigits(str);
   }
}

class CountDigits
{
    public static void countDigits(String str)
    {
        try 
        {
            FileWriter fw = new FileWriter("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q4\\sample.txt");
            fw.write(str);
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("File write error....");
        }
        int digits = 0;
        try
        {
            FileReader fr = new FileReader("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q4\\sample.txt");
            int data;
            while((data=fr.read())!=-1)
            {
                char c = (char)data;
                if(Character.isDigit(c))
                {
                    digits+=1;
                }
            }
            System.out.println(digits);
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File Read Error....");
        }
    }
}
