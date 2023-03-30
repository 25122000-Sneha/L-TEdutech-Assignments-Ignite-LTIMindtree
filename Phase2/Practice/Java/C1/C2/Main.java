package Phase2.Practice.Java.C1.C2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Name:");
        String n = reader.nextLine();
        System.out.println("Enter Age:");
        int a = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter Country:");
        String c = reader.nextLine();

        Player p = new Player();
        p.setName(n);
        p.setAge(a);
        p.setCountry(c);
        System.out.println("POlayer Details:");
        System.out.println("Name:"+p.getName());
        System.out.println("Age:"+p.getAge());
        System.out.println("Country:"+p.getCountry());
    }
}
