package Foundation.Activities.BreakContinueActivity.Hospital;

import java.util.Scanner;

public class Hospital {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 0;
        String pattern = "^[0-9]{2}[a-zA-Z]{2}";
        do 
        {
            String id = reader.nextLine();
            String valid ;
            if(id.matches(pattern))
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
