package Foundation.Activities.WhileAndDoWhileActivity.MultiplicationTable;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter n");
        int n = reader.nextInt();
        System.out.println("Enter m");
        int m = reader.nextInt();
        reader.close();

        System.out.println("The multiplication table of "+n+" is");
        int i=1;
        while(i<=m)
        {
            System.out.println(i+"*"+n+"="+i*n);
            i++;
            
        }
    
    }
}
