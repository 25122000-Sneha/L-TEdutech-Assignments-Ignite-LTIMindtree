package Phase2.Practice1.Week5.Q37;

public class ContactDetailBO {
    
    static void validate(String mobileNumber, String alternateMobileNumber) throws DuplicateMobileNumberException
    {
        if(mobileNumber.equals(alternateMobileNumber))
        {
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        }

    }
}
