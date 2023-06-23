package Phase3.NeoPractice.FileIO.Q1;
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
        // Type your code here
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = reader.nextInt(); 
        }
        File myFile = new File("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q1\\index.txt");
        try
        {
            boolean res = myFile.createNewFile();
            if(res == false)
            {
                System.out.println("File creation error....");
            }
        }
        catch(IOException e)
        {
            System.out.println("File error....");
        }
        try
        {
            BufferedWriter br = new BufferedWriter(new FileWriter("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q1\\index.txt"));
            for(int i=0; i<n; i++)
            {
                br.write(String.valueOf(arr[i])+"\n");
            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File write error!");
        }
        MinElement.findMin();
        reader.close();
    }
}

class MinElement
{
    public static void findMin() 
    {
        Scanner reader = new Scanner(System.in);
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Internship\\Phase3\\NeoPractice\\FileIO\\Q1\\index.txt"));
            String str;
            int min = Integer.MAX_VALUE;
            while((str=br.readLine())!=null)
            {
                int num = Integer.parseInt(str);
                if(num < min)
                {
                    min = num;
                }
            }
            System.out.println(min);
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("File read error....");
        }
    }
}

/*
5
82 53 90 105 100
 */
