package Foundation.Activities.LoopForLoopActivity.DesignCodes.Series2;

import java.util.*;
/**
 * Series2
 */
public class Series2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();

		int val=3;
		int add = 4;
		for(int i=1; i<=count; i++)
		{
			System.out.print(val+" ");
			val = val + add;
			add = add*2;
		}
    }
}