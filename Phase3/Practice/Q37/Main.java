package Phase3.Practice.Q37;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the contact details");
        String detail = reader.nextLine();
        String[] detailArr = detail.split(",");
        ContactDetail obj = new ContactDetail(detailArr[0], detailArr[1], detailArr[2], detailArr[3], detailArr[4]);
        try 
        {
            ContactDetailBO.validate(obj.getMobileNumber(), obj.getAlternateMobileNumber());
            System.out.println(obj);
        }
        catch(DuplicateMobileNumberException e)
        {
            System.out.println("DuplicateMobileNumberException: "+e.getMessage());
        }
    }
}
