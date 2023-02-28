package Foundation.Activities.PrimitiveDataTypeActivity.TypeCasting;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        System.out.println("Enter a double value");
        double val = reader.nextDouble();
        System.out.println("Double value = "+val);
        System.out.println("Typecasted to float : Value = "+(float)val);
        System.out.println("Typecasted to long : Value = "+(long)val);
        System.out.println("Typecasted to int : Value = "+(int)val);
        System.out.println("Typecasted to short : Value = "+(short)val);
        System.out.println("Typecasted to byte : Value = "+(byte)val);
            
    }
}
