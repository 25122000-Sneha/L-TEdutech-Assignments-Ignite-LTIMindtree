package Phase2.Practice1.Week5.Q19;
import java.util.*;
public class LetterSequence {
    private String sentence;
    LetterSequence(String sentence)
    {
        this.sentence = sentence;
    }
    public TreeMap<Character,Integer> computeFrequency()
    {
        TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
        for(int i=0; i<sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else 
            {
                map.put(ch, 1);
            }
        }
        return map;
    }

    public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap)
    {
        for(Map.Entry<Character,Integer> e : frequencyMap.entrySet())
        {
            if(e.getKey() != ' ')
            {
            System.out.print(e.getKey()+":");
            for(int i=0; i<e.getValue(); i++)
            {
                System.out.print("*");
            }
            System.out.println();
            }
            

        }
    }
}
