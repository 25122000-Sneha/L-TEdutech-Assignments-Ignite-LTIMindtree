package Phase2.Week_6.Exceptions.Codes.Q8;

public class UserBO {
    static void validate(User u) throws WeakPasswordException
    {
        String password = u.getPassword();
        int letter=0, digits=0, specialChar=0;
        if(password.length()>=8 && password.length()<=20)
        {
            for(int i=0; i<password.length(); i++)
            {
                char ch = password.charAt(i);
                if(Character.isDigit(ch))
                {
                    digits++;
                }
                else if(Character.isLetter(ch))
                {
                    letter++;
                }
                else if(!Character.isWhitespace(ch))
                {
                    specialChar++;
                }
                
            }
            if((digits>=1) && (letter>=1) && (specialChar>=1))
            {
                return;
            }
            else 
            {
                throw new WeakPasswordException("Your password is weak");
            }
        }
        else 
        {
            throw new WeakPasswordException("Your password is weak");
        }

    }
}
