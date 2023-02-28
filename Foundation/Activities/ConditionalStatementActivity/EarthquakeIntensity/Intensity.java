package Foundation.Activities.ConditionalStatementActivity.EarthquakeIntensity;

import java.util.Scanner;

public class Intensity {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Richter Magnitude:");
        double val = reader.nextDouble();

        if(val<=2.4)
        {
            System.out.println("Micro");
        }
        else if((val>=2.5 ) && (val<=5.4))
        {
             System.out.println("Light");
        }
        else if((val>=5.5 ) && (val<=6.0))
        {
             System.out.println("Moderate");
        }
        else if((val>=6.1 ) && (val<=6.9))
        {
             System.out.println("Strong");
        }
        else if((val>=7.0 ) && (val<=7.9))
        {
             System.out.println("Major");
        }
        else if(val>=8.0)
        {
             System.out.println("Great");
        }

    }
}
