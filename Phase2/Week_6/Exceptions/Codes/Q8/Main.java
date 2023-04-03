package Phase2.Week_6.Exceptions.Codes.Q8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the user details");
        String detail = reader.nextLine();
        String[] detailArr = detail.split(",");
        User obj = new User(detailArr[0], detailArr[1], detailArr[2], detailArr[3]);
        try{
            UserBO.validate(obj);
            System.out.println(obj);
        }
        catch(WeakPasswordException e)
        {
            System.out.println(e.getClass().getName()+": "+e.getMessage());
        }
    }
}
