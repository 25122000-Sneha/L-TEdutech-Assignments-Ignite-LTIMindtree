package Foundation.Activities.DataEncapsulationAndStaticActivity.StaticMembers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Object 1 details");
        System.out.println("Enter i1");
        Integer i1Val = reader.nextInt();
        System.out.println("Enter i2");
        Integer i2Val = reader.nextInt();
        
        StaticIllustration s1 = new StaticIllustration();
        s1.setI1(i1Val);
        StaticIllustration.setI2(i2Val);
        System.out.println("Object 1 Details : ");
        s1.displayDetails();

        System.out.println("Enter Object 2 details");
        System.out.println("Enter i1");
        Integer i1Val_2 = reader.nextInt();
        System.out.println("Enter i2");
        Integer i2Val_2 = reader.nextInt();
        StaticIllustration s2 = new StaticIllustration();
        s2.setI1(i1Val_2);
        StaticIllustration.setI2(i2Val_2);
        System.out.print("Object 2 Details : ");
        s2.displayDetails();
        System.out.print("Object 1 Details : ");
        s1.displayDetails();
    }
}
