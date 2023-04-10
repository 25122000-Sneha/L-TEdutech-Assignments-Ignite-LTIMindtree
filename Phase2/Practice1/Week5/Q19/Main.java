package Phase2.Practice1.Week5.Q19;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter input string:");
        String sen = reader.nextLine();
        LetterSequence obj = new LetterSequence(sen);

        TreeMap<Character,Integer> map = obj.computeFrequency();
        obj.displayLetterFrequency(map);
    }
}
