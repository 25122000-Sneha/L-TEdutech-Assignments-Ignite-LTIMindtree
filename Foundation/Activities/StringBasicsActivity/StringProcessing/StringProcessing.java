package Foundation.Activities.StringBasicsActivity.StringProcessing;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the input string");
        String str = reader.nextLine().trim();
        String[] strArr = str.split(" ");
        String res = strArr[0];
        for(int i=1; i<strArr.length; i++)
        {
            res += " " + strArr[i].toUpperCase();
        }
        System.out.println("The processed string is "+res);

    }
}
