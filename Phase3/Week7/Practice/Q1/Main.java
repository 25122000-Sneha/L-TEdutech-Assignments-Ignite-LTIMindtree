package Phase3.Week7.Practice.Q1;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        int vowels = 0;
        try
        {
            FileReader input = new FileReader("D:\\Internship\\Phase3\\Week7\\Practice\\sample.txt");
            int data;
            while((data = input.read())!=-1)
            {
                char c = (char)data;
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                {
                    vowels++;
                }
            }
            input.close();

        }
        catch(IOException e)
        {
            System.out.println("File read error");
        }
    }
}
