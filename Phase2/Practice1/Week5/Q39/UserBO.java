package Phase2.Practice1.Week5.Q39;

public class UserBO {
    static void validate(User u) throws WeakPasswordException
    {
        String password = u.getPassword();
        if(password.length()>=8 && password.length()<=20)
        {
            int digits = 0;
            int specialChars = 0;
            int letters = 0;
            for(int i=0; i<password.length(); i++)
            {
                char ch = password.charAt(i);
                if(Character.isDigit(ch))
                {
                    digits++;
                }
                else if(Character.isLetter(ch))
                {
                    letters++;
                }
                else if(!Character.isWhitespace(ch))
                {
                    specialChars++;
                }
            }
            if((digits>=1) && (specialChars>=1) && (letters>=1))
            {
                return;
            }
        }
        else 
        {
            throw new WeakPasswordException("Your password is weak");
        }
    }
}
