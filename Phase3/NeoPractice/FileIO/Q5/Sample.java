package Phase3.NeoPractice.FileIO.Q5;
// You are using Java
import java.io.*;
import java.util.*;
class Sample {
   public static void main(String args[]) throws Exception{
       // Type your code here
       Scanner reader = new Scanner(System.in);
       String str = reader.nextLine();
       try 
       {
           File myFile = new File("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q5\\sample.txt");
           boolean res = myFile.createNewFile();
           if(res == false)
           {
               System.out.println("File create error....");
           }
       }
       catch(IOException e)
       {
           System.out.println("File error");
       }
       CountLetters.countLetters(str);
   }
}

class CountLetters
{
    public static void countLetters(String str)
    {
        try 
        {
            FileWriter fw = new FileWriter("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q5\\sample.txt");
            fw.write(str);
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("File Write Error....");
        }
        int upperLetters = 0;
        int lowerLetters = 0;
        try 
        {
            FileReader fr = new FileReader("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q5\\sample.txt");
            int data;
            while((data=fr.read())!=-1)
            {
                char c = (char)data;
                
                if(Character.isUpperCase(c))
                {
                    upperLetters++;
                }
                if(Character.isLowerCase(c))
                {
                    lowerLetters++;
                }
                
            }
            System.out.println(upperLetters);
            System.out.println(lowerLetters);
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("File Read Error....");
        }
    }
    
}
