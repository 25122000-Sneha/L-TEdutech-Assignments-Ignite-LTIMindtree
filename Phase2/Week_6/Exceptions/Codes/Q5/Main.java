package Phase2.Week_6.Exceptions.Codes.Q5;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args)throws Exception{
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the contact details");
        String detail = reader.nextLine();
        String[] detailArr = detail.split(",");
        ContactDetail obj = new ContactDetail(detailArr[0], detailArr[1], detailArr[2], detailArr[3], detailArr[4]);
        try{
            ContactDetailBO.validate(obj.getMobileNumber(), obj.getAlternateMobileNumber());
            System.out.println(obj);
        }
        catch(DuplicateMobileNumberException e)
        {
            System.out.println(e);
        }
    
	}
}
