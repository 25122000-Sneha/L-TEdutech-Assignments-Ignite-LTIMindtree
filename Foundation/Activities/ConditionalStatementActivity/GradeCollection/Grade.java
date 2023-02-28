package Foundation.Activities.ConditionalStatementActivity.GradeCollection;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = reader.nextInt();
        if((marks>=0 ) && (marks<=100))
        {
            if(marks==100)
            {
                System.out.println("The student obtained a S grade");
            }
            else if((marks>=90) && (marks<100))
            {
                System.out.println("The student obtained a A grade");
            }
            else if((marks>=80) && (marks<90))
            {
                System.out.println("The student obtained a B grade");
            }
            else if((marks>=70) && (marks<80))
            {
                System.out.println("The student obtained a C grade");
            }
            else if((marks>=60) && (marks<70))
            {
                System.out.println("The student obtained a D grade");
            }
            else if((marks>=50) && (marks<60))
            {
                System.out.println("The student obtained a E grade");
            }
            else if(marks<50)
            {
                System.out.println("The student obtained a F grade");
            }
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}
