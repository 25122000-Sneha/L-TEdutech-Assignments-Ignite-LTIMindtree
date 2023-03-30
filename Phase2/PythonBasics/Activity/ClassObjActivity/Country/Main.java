package Phase2.PythonBasics.Activity.ClassObjActivity.Country;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the country name");
        String name = reader.nextLine();
        System.out.println("Enter the country code");
        String code = reader.nextLine();
        System.out.println("Enter the isd code");
        String isd = reader.nextLine();

        Country obj = new Country(name, code, isd);
        obj.display();
    }
}
