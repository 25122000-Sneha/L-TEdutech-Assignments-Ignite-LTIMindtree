package Phase3.NeoPractice.Exceptions.Q1;

// You are using Java
import java.util.*;
class Student
{
    int rollNo;
    String name;
    int age;
    String course;
    Student(int rollNo, String name, int age, String course)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
}
class AgeNotWithinRangeException extends Exception
{
    AgeNotWithinRangeException(String str)
    {
        super(str);
    }
}
class NameNotValidException extends Exception
{
    NameNotValidException(String str)
    {
        super(str);
    }
}
class Main
{
    public static boolean isValid(String name)
    {
        for(int i=0; i<name.length(); i++)
        {
            char c = name.charAt(i);
            if(Character.isDigit(c))
            {
                return false;
            }
            else if((!Character.isLetter(c)) && (!Character.isDigit(c)))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int rollNo = Integer.parseInt(reader.nextLine());
        String name = reader.nextLine();
        int age = Integer.parseInt(reader.nextLine());
        String course = reader.nextLine();
        
        Student obj = new Student(rollNo, name, age, course);
        try 
        {
            
            if((obj.age<15) || (obj.age>21))
            {
                throw new AgeNotWithinRangeException("Age is not between 15 and 21");
            }
            else if(!isValid(obj.name))
            {
                throw new NameNotValidException("Name is not Valid");
            }
        }
        catch(AgeNotWithinRangeException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NameNotValidException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println(obj.rollNo+" "+obj.name+" "+obj.age+" "+obj.course);
        }
    }
}