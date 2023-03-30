
package Foundation.Activities.Assessment1.Weekly1;
import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else 
            {
                map.put(c, 1);
            }
        }
        char firstNotRepeatChar = ' ';
        int flag = 0;
        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(map.get(c) == 1)
            {
                firstNotRepeatChar = c;
                flag++;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("All chars are repeating");

        }
        else 
        {
            System.out.println(str.indexOf(firstNotRepeatChar));
        }
    }
}
