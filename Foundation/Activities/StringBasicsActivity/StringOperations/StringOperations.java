/*Compares two strings lexicographically. 
The comparison is based on the Unicode value of each 
character in the strings. The character sequence represented by
 this String object is compared lexicographically to the 
 character sequence represented by the argument string.
  The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
 * 
 */
package Foundation.Activities.StringBasicsActivity.StringOperations;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String str1 = reader.nextLine();
        String str2 = reader.nextLine();
        System.out.println("The length of the first string is "+str1.length());
        System.out.println("The length of the second string is "+str2.length());
        System.out.println("The uppercase of the first string is "+str1.toUpperCase());
        System.out.println("The uppercase of the second string is "+str2.toUpperCase());
        System.out.println("The concatenated string is "+str1.concat(str2));
        int ch = str1.compareTo(str2);
        //System.out.println(ch);
        if(ch==0)
        {
            System.out.println("Both the input strings are the same");
        }
        else if(ch<0)
        {
            System.out.println(str1+" appears before "+str2);
        }
        else if(ch>0)
        {
            System.out.println(str2+" appears before "+str1);
        }
        
    }
}
