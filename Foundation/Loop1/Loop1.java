//Print first 20 numbers of Fibonacci Series
package Foundation.Loop1;
import java.util.*;
class Loop1{
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int sum = 0, count=2;
        while(count < 20)
        {
            sum = a+b;
            System.out.println(sum);
            a = b;
            b = sum;
            count++;
        }
        
    }
}