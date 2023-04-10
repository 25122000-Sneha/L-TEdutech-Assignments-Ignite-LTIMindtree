package Phase2.Practice1.Week5.Q39;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try 
        {
            System.out.println("Enter the user details");
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            User obj = new User(detailArr[0], detailArr[1], detailArr[2], detailArr[3]);
            UserBO.validate(obj);
            System.out.println(obj);
        }
        catch(WeakPasswordException e)
        {
            System.out.println(e);

        }
    }
}
