package Phase2.Practice1.Week5.Q37;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try
        {
            System.out.println("Enter the contact details");
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            ContactDetailBO.validate(detailArr[0], detailArr[1]);
            ContactDetail obj = new ContactDetail(detailArr[0], detailArr[1], detailArr[2], detailArr[3], detailArr[4]);
            System.out.println(obj);
        }
        catch(DuplicateMobileNumberException e)
        {
            System.out.println(e);
        }
    }
}
