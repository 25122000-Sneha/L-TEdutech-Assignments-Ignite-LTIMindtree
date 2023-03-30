package Foundation.Practice.Prime;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        for(int x=num1; x<=num2; x++)
        {
            int flag = 0;
            for(int i=2; i<x; i++)
            {
                if(x%i==0)
                {
                    flag++;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(x);
            }
        }

    }
}
