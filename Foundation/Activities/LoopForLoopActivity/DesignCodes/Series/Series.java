package Foundation.Activities.LoopForLoopActivity.DesignCodes.Series;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
			int num = reader.nextInt();
			reader.close();
			int val = 4;
			int mul = 16;
			
			for(int i=0; i<num; i++)
			{
				
				System.out.print(val+" ");
				mul = mul/2;
				val = val*mul;
			}
    }
}
