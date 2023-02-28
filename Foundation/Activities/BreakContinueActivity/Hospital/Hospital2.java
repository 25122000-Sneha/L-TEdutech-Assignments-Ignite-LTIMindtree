package Foundation.Activities.BreakContinueActivity.Hospital;

import java.util.Scanner;

public class Hospital2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        //String pattern = "^[0-9]{2}[a-zA-Z]{2}";
        do 
        {
            String id = reader.nextLine();
            String valid ;
            if((id.length()==4) && Character.isDigit(id.charAt(0))==true && Character.isDigit(id.charAt(1))==true && Character.isLetter(2)==true && Character.isLetter(3)==true)
            {
                String name = reader.nextLine();
                valid = reader.nextLine();
                //System.out.println(valid);
                count++;
                if(valid.equals("no"))
                {
                    break;
                }
                
            }
            else {
                break;
            }
            
            
        }while(true);
        System.out.println(count);
    }
}
