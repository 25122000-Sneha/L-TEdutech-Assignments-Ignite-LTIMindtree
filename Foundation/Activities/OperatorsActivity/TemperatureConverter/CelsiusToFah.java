package Foundation.Activities.OperatorsActivity.TemperatureConverter;

import java.util.Scanner;

public class CelsiusToFah {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.println("Temperature in Celsius:");
            int cel = reader.nextInt();

            double fah = (cel*1.8)+32;
            System.out.println("Temperature in Fahrenheit is "+String.format("%.1f", fah)+"F");
    }
}
