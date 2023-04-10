package Phase2.Week_5.Weekly2.Q8;
import java.util.*;
class Employee{
    int empId;
    double salary;
    
}
class EmpLevel extends Employee{
    int level;
    EmpLevel(int empId, double salary)
    {
        this.empId = empId;
        this.salary = salary;
    }
    public void findLevel()
    {
        if(salary > 1000.0)
        {
            level = 1;
        }
        else
        {
            level = 2;
        }
        
    }
    public String toString()
    {
        return this.empId+"\n"+this.salary+"\n"+this.level;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int id = reader.nextInt();
        double salary = reader.nextDouble();
        EmpLevel obj = new EmpLevel(id, salary);
        obj.findLevel();
        System.out.println(obj);

    }
}
