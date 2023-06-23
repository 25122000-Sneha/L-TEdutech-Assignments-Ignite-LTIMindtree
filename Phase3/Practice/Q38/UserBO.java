package Phase3.Practice.Q38;

public class UserBO {
    static void validate(User u) throws WeakPasswordException
    {
        String password = u.getPassword();
        if(password.length()>=8 && password.length()<=20)
        {
            int digits = 0;
            int chars = 0;
            int specialChars = 0;
            for(int i=0; i<password.length(); i++)
            {
                char c = password.charAt(i);
                if(Character.isDigit(c))
                {
                    digits++;
                }
                else if(Character.isLetter(c))
                {
                    chars++;
                }
                else if(!Character.isWhitespace(c))
                {
                    specialChars++;
                }
            }
            if((digits>=1) && (chars>=1) && (specialChars>=1))
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
