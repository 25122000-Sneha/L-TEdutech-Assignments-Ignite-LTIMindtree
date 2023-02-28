package Foundation.Activities.LoopForLoopActivity.DesignCodes.Factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                int n = reader.nextInt();
                reader.close();
                int fact = 1;
                for(int i=1; i<=n; i++)
                {
                    fact*=i;
                }
                System.out.println(fact);
    }
}
