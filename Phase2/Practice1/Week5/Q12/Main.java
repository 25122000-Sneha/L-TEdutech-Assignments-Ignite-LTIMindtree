package Phase2.Practice1.Week5.Q12;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<String>();
        String ch;
        do
        {
            System.out.println("Enter Email address");
            String email =reader.nextLine();
            set1.add(email);
            System.out.println("Do you want to Continue?(yes/no)");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        HashSet<String> set2 = new HashSet<String>();
        System.out.println("Enter the email adresses to be searched seperated");
        String ads = reader.nextLine();
        String[] adsArr = ads.split(",");
        int flag = 0;
        for(String email : adsArr)
        {
            if(!set1.contains(email))
            {
                flag++;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Email addresses are not present");
        }
        else 
        {
            System.out.println("Email addresses are present");
        }
    }
}
