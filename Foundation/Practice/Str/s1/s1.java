package Foundation.Practice.Str.s1;
import java.util.*;
public class s1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str = reader.nextLine();
        String newStr = "";
        newStr += str.charAt(0);
        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(i-1))
            {
                newStr += "*" + str.charAt(i);
            }
            else 
            {
                newStr += str.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
