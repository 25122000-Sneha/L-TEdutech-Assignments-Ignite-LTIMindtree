package Phase2.Practice1.OOP.Q10;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Staff obj = new Staff();
        System.out.println("Enter the name of the staff:");
        obj.setStaffName(reader.nextLine());
        System.out.println("Enter the staff designation:");
        obj.setDesignation(reader.nextLine());
        
        Department d = new Department();
        System.out.println("Enter the department name:");
        d.setDeptName(reader.nextLine());
        d.displayStaff();
    }
}
