package Phase3.Week7.WorkingWithTextFilesActivity.Q1;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        
        try 
        {
            FileReader fr = new FileReader("sample.txt");
            int i;
            int vowels = 0;
            while((i = fr.read()) != -1)
            {
                char c = (char)i;
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    vowels++;
                }
            }
            System.out.println("The number of vowels present in file is: "+vowels);
            fr.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
		
    }
}