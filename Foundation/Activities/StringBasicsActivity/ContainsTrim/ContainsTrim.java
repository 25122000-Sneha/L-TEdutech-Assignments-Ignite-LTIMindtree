package Foundation.Activities.StringBasicsActivity.ContainsTrim;
import java.util.*;
public class ContainsTrim {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                System.out.println("Enter the text from the document");
                String str = reader.nextLine();
                System.out.println("Enter the string to be found in the data");
                String text = reader.nextLine();
                if(str.contains(text.trim()))
                {
                    System.out.println("String is found in the document");
                }
                else 
                {
                    System.out.println("String is not found in the document");
                }
    }
}
