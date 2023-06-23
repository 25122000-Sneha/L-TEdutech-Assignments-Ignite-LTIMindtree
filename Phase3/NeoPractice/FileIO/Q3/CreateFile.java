package Phase3.NeoPractice.FileIO.Q3;
// You are using Java
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException; 
public class CreateFile 
{ 
    public static void main(String[] args) throws IOException 
    { 
        // Type your code here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt();
        }
        
        IntegerArray.writeReadArray(arr);
    }
}

class IntegerArray
{
    public static void writeReadArray(int[] arr)
    {
        try 
        {
            BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q3\\index.txt"));
            for(int i=0; i<arr.length; i++)
            {
                br.write(String.valueOf(arr[i])+"\n");
            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File Write error....");
        }
        
       int sum = 0; 
       try 
       {
           BufferedReader br = new BufferedReader(new FileReader("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q3\\index.txt"));
           String str;
           while((str=br.readLine())!=null)
           {
               int num = Integer.parseInt(str);
               sum += num;
               System.out.print(num+" ");
           }
           System.out.print(sum);
           br.close();
       }
       catch(IOException e)
       {
           System.out.println("File Read error....");
       }
       
    }
}
