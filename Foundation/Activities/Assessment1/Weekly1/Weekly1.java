
//Find the index of first non-repeating char in a string. If not found return -1;
package Foundation.Activities.Assessment1.Weekly1;
import java.util.*;
public class Weekly1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else 
            {
                map.put(ch, 1);
            }
        }
        int flag = 0;
        char c = ' ';
        for(char ch : str.toCharArray())
        {
            if(map.get(ch) == 1)
            {
                flag++;
                c = ch;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println(-1);
        }
        else 
        {
            System.out.println(str.indexOf(c));
        }
    }
}
