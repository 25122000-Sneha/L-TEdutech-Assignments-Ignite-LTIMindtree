package Phase2.Week_5.Practice.ArrayList.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        char ch;
        ArrayList<String> arr = new ArrayList<String>();
        do{
            System.out.println("Enter the username "+i);
            String name = reader.nextLine();
            arr.add(name);
            i++;
            System.out.println("Do you want to continue?(y/n)");
            ch = reader.nextLine().charAt(0);
        }while(ch == 'y');
        System.out.println("The Names entered are:");
        for(String name : arr)
        {
            System.out.println(name);
        }
    }
}
