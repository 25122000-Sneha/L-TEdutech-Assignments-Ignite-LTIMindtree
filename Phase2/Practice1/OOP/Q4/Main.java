package Phase2.Practice1.OOP.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Name:");
        String n = reader.nextLine();
        System.out.println("Enter Age:");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Enter Country:");
        String c = reader.nextLine();
        Player p = new Player();
        p.setName(n);
        p.setAge(a);
        p.setCountry(c);
        System.out.println("Player Details:");
        System.out.println("Name:"+p.getName());
        System.out.println("Age:"+p.getAge());
        System.out.println("Country:"+p.getCountry());
    }
}
