package Phase2.Week_5.SetActivity.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter number of colleges");
		int no = reader.nextInt();
        
		Set<String> set = new LinkedHashSet<String>();
		System.out.println("Enter the college details one by one");
		for(int i=0; i<no; i++)
		{
			set.add(reader.nextLine());
		}
		System.out.println("Enter number of colleges to be displayed");
		int clgNo = reader.nextInt();
        reader.nextLine();
		if(clgNo > no)
		{
			System.out.println("Invalid");
			System.exit(0);
		}
		else 
		{
			System.out.println("First "+clgNo+" college details");
			Iterator itr = set.iterator();
			int count = 0;
			while(count!=clgNo)
			{
				System.out.println(itr.next());
				count++;
			}
			
		}
		reader.nextLine();
        System.out.println("Enter the collage code to search :");
        String code = reader.nextLine();
        int flag = 0;
        for(String clg : set)
        {
            String[] clgArr = clg.split("-");
            if(code.equals(clgArr[0]))
            {
                System.out.println("Entered college code is found");
                flag++;
            }
        }
        if(flag == 0)
        {
            System.out.println("Entered college code is not found");
        }
    }
}
