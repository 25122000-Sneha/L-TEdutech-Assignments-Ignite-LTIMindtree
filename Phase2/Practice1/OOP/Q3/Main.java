package Phase2.Practice1.OOP.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the country name");
        String n = reader.nextLine();
        System.out.println("Enter the country code");
        String c = reader.nextLine();
        System.out.println("Enter the isd code");
        String isd = reader.nextLine();

        Country obj = new Country(n, c, isd);
        obj.display();
    }
}
