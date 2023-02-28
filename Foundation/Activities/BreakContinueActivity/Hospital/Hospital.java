package Foundation.Activities.BreakContinueActivity.Hospital;

import java.util.Scanner;

public class Hospital {
    public static boolean isValid(String id)
    {
        System.out.println(id.length());
        System.out.println(Character.isDigit(id.charAt(0)));
        System.out.println(Character.isDigit(id.charAt(1)));
        System.out.println(Character.isLetter(id.charAt(2)));
        System.out.println(Character.isLetter(id.charAt(3)));

        if(id.length()==4)
        {
            if(Character.isDigit(id.charAt(0)) && Character.isDigit(id.charAt(1)) && Character.isLetter(id.charAt(2)) && Character.isLetter(3))
            {
                return true;
            }
            else
            return false;
        }
        else 
        {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        do 
        {
            String id = reader.nextLine();
            String name = reader.nextLine();
            boolean val = isValid(id);
            System.out.println("result:"+val);
            if(val == true)
            {
                System.out.println("yes");
                count++;
                
            }
            else 
            {
                System.out.println("no");
                break;
            }
        }while(true);
        System.out.println(count);
    }
}
