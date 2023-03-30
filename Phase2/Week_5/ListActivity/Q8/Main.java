package Phase2.Week_5.ListActivity.Q8;
import java.util.*;
public class Main{
    public static int countDigits(int n)
	{
		int digits = 0;
		while(n!=0)
		{
			int lastDigit = n%10;
			digits ++;
			n = n/10;
		}
		return digits;
	}
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number of participants to be registered :");
		int no = reader.nextInt();
        reader.nextLine();
		LinkedList<String> list = new LinkedList<String>();
		String detail;
		String[] detailArr;
		System.out.println("Enter the participants details");
		for(int i=0; i<no; i++)
		{
			detail = reader.nextLine();
			detailArr = detail.split("_");
			if((detailArr[1].equals("IT") || detailArr[1].equals("CSE") || detailArr[1].equals("ECE")) && (countDigits(Integer.parseInt(detailArr[2])) == 7))
			{
				list.add(detail);
			}
		}
        System.out.println(list);
		
		if(list.isEmpty())
        {
            System.out.println("No valid participants");
        }
        else 
        {
            System.out.println("List of valid participants");
            for(String stud : list)
            {
                System.out.println(stud);
            }
        }
    }
}