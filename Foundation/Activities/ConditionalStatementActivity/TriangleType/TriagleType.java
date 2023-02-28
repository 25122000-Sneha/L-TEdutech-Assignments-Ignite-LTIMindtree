package Foundation.Activities.ConditionalStatementActivity.TriangleType;

import java.util.Scanner;

public class TriagleType {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                int a1 = reader.nextInt();
                int a2 = reader.nextInt();
                int a3 = reader.nextInt();
                reader.close();

                
                if(a1+a2+a3 == 180)
                {
                    if((a1==60) && (a2==a1) && (a3==a1))
                    {
                        System.out.println("Triangle is equilateral");
                    }
                    else if((a1==a2) || (a2==a3) || (a3==a1))
                    {
                        if(a1==90 || a2==90 || a3==90)
                        {
                            System.out.println("Triangle is isosceles right");
                        }
                        else
                        {
                            System.out.println("Triangle is isosceles");
                        }
                    }
                    else if(a1==90 || a2==90 || a3==90)
                    {
                        System.out.println("Triangle is right");
                    }
                    else
                    {
                        System.out.println("Triangle is not special");
                    }
                }
                else
                {
                    System.out.println("Not a Triangle");
                }

     
    }
}
