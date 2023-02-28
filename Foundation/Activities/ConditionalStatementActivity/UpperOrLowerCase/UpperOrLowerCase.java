package Foundation.Activities.ConditionalStatementActivity.UpperOrLowerCase;

import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                char c = reader.nextLine().charAt(0);

                if(Character.isUpperCase(c))
                {
                    System.out.println(c+" is uppercase letter");
                }
                else if(Character.isLowerCase(c))
                {
                    System.out.println(c+" is lowercase letter");
                }
                else{
                    System.out.println(c+" is neither an uppercase or lowercase letter");
                }
    }
}
