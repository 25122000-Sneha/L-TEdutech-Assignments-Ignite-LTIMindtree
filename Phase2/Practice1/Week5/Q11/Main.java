package Phase2.Practice1.Week5.Q11;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        String ch;
        do{
            System.out.println("Enter Username");
            String name = reader.nextLine();
            set.add(name);
            System.out.println("Do you want to continue?(yes/no)");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        System.out.println(set.size());
    }
}
