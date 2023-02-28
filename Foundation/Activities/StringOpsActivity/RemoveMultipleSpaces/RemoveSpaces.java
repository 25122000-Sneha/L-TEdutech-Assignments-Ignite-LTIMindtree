package Foundation.Activities.StringOpsActivity.RemoveMultipleSpaces;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = reader.nextLine();
        
        String[] arr = str.split("\\s+");   // + for single or multiple spaces
        
        String newStr = "";
        for(int i=0; i<arr.length; i++)
        {
            newStr += " " + arr[i];
        }
        System.out.println("The processed string is"+newStr);
        
    }
}
