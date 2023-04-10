package Phase2.Practice1.Week5.Q10;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        char ch;
        do
        {
            System.out.println("Enter Username");
            String name = reader.nextLine();
            set.add(name);
            System.out.println("Do you want to continue?(Y/N)");
            ch = reader.nextLine().charAt(0);

        }while(ch == 'Y');
        System.out.println("The unique number of usernames is "+set.size());

    }
}
