package Foundation.Activities.WhileAndDoWhileActivity.Sum;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int num;
        
        do
        {
            num = reader.nextInt();
            if(num==-999)
            {
                break;
            }
            sum+=num;
        }while(true);
        System.out.println("The sum is "+sum);
    }
}
