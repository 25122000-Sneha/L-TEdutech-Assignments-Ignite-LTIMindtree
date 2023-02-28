package Foundation.Activities.StringOpsActivity.TextToSMS;

import java.util.Scanner;

public class TextToSMS {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
       // String newStr = "";
        if(str.contains("yes"))
        {
            str = str.replace("yes", "s");
        }
        if(str.contains("you"))
        {
             str = str.replace("you", "u");
        }
        if(str.contains("today"))
        {
             str = str.replace("today", "2day");
        }
        if(str.contains("why"))
        {
             str= str.replace("why", "y");
        }
        System.out.println(str);
    }
}
