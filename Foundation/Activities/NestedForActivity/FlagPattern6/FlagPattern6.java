package Foundation.Activities.NestedForActivity.FlagPattern6;

import java.util.Scanner;

public class FlagPattern6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==j) & (i==(int)Math.ceil(n/2.0)))
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print("~");
                }
            }
            System.out.println();
        }
    }
}
/*
input: 7 
output:    
~~~~~~~
~~~~~~~
~~~~~~~
~~~*~~~
~~~~~~~
~~~~~~~
~~~~~~~
 */
/*
input: 3
output:
~~~
~*~
~~~
 */