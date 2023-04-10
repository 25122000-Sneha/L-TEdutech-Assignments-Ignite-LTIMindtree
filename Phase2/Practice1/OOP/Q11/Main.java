package Phase2.Practice1.OOP.Q11;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the student name:");
        String n = reader.nextLine();
        System.out.println("Enter the register number:");
        int rn = Integer.parseInt(reader.nextLine());
        Student stud = new Student(n, rn);
        System.out.println("Enter the course id:");
        int cn = Integer.parseInt(reader.nextLine());
        System.out.println("Enter the course name:");
        String cName = reader.nextLine();
        Course obj = new Course(cn, cName);
        stud.display(obj);
    }
}
