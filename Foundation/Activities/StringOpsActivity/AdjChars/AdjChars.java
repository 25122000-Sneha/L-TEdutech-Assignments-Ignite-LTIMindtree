package Foundation.Activities.StringOpsActivity.AdjChars;

import java.util.Scanner;

public class AdjChars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the string");
        String  str = reader.nextLine();
        String newStr = "";
        newStr+=str.charAt(0);
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i)==str.charAt(i-1))
            {
                newStr += "*";
                newStr += str.charAt(i);
            }
            else 
            {
                newStr += str.charAt(i);
            }
            
        }
        System.out.println("The processed string is "+newStr); 
    }
}
