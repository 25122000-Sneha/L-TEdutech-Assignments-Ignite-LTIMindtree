package Phase2.Week_5.Practice.HashSet.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<String>();
        String ch;
        do
        {
            System.out.println("Enter Email address");
            String email = reader.nextLine();
            set1.add(email);
            System.out.println("Do you want to Continue?(yes/no)");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        HashSet<String> set2 = new HashSet<String>();
        System.out.println("Enter the email addresses to be searched seperated by comma");
        String ads = reader.nextLine();
        String[] adsArr = ads.split(",");
        for(String email : adsArr)
        {
            set2.add(email);
        }
        
        if(set1.containsAll(set2))
        {
            System.out.println("Email addresses are present");
        }
        else 
        {
            System.out.println("Email addresses are not present");
        }
    }
}
