package Foundation.Practice.Str;
import java.util.*;
class Str1{
    public static void main(String[] args)
    {
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
        for(Map.Entry<Character, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey() + " "+ e.getValue());
        }
    }
}
