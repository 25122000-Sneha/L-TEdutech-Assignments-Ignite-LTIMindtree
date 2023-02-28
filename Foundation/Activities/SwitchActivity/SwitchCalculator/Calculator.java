package Foundation.Activities.SwitchActivity.SwitchCalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the first value :");
        int n1 = reader.nextInt();
        System.out.println("Enter the second value :");
        int n2 = reader.nextInt();
        System.out.println("Enter the choice from the menu");
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int ch = reader.nextInt();
        int result;
        switch(ch)
        {
            case 1:
                result = n1+n2;
                System.out.println("The value after Addition is "+result+".");
                break;
            case 2:
                result = n1-n2;
                System.out.println("The value after Subtraction is "+result+".");
                break;
            case 3:
                result = n1*n2;
                System.out.println("The value after Multiplication is "+result+".");
                break;
            case 4:
                result = n1/n2;
                System.out.println("The value after Division is "+result+".");
                break;


        }
        

    }
}
