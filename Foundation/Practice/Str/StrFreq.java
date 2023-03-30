//Frequency of chars in string in sorted order
package Foundation.Practice.Str;
import java.util.*;
public class StrFreq {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        for(char c='A'; c<='z'; c++)
        {
            int k = 0;
            for(int j=0; j<str.length(); j++)
            {
                if(c==str.charAt(j))
                {
                    k++;
                }
            }
            if(k>0)
            {
                System.out.println(c+" "+k);
            }
        }
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }
}
