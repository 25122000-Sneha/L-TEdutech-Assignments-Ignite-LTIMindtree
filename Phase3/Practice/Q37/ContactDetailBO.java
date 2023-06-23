package Phase3.Practice.Q37;

public class ContactDetailBO {
    public static void validate(String mobileNumber, String alternateMobileNumber) throws DuplicateMobileNumberException
    {
        if(mobileNumber.equals(alternateMobileNumber))
        {
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        }
    }
}
