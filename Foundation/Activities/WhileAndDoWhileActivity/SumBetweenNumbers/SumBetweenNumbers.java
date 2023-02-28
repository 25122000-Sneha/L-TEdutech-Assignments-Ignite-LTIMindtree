package Foundation.Activities.WhileAndDoWhileActivity.SumBetweenNumbers;

import java.util.Scanner;

public class SumBetweenNumbers {
    static public void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        do{
            System.out.println("Type a value between 0 and 20");
            num = reader.nextInt();
            if(num>=0 && num<=20)
            {
                break;
            }
        }while(true);
        System.out.println("The final value "+(num+17));
    }
}
