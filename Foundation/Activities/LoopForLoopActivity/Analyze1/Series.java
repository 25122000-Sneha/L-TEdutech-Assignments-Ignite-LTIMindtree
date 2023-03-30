//2, 6, 12, 20, 30
package Foundation.Activities.LoopForLoopActivity.Analyze1;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int count = 0;
        int val = 2;
        int strt = 4;
        while(count!=n)
        {
            System.out.print(val+" ");
            val+= strt;
            strt+=2;
            count++;
        }
    }
}
