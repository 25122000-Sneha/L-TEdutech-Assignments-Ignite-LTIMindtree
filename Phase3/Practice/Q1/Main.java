package Phase3.Practice.Q1;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        int vowels = 0;
        try 
        {
            FileReader input = new FileReader("D:\\Internship\\Phase3\\Practice\\Q1\\sample.txt");
            int data;
            while((data=input.read()) != -1)
            {
                char c = (char)data;
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                {
                    vowels++;
                }
            }
            System.out.println("The number of vowels present in file is:"+vowels);
            input.close();
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("File read error....");
        }
    }
}