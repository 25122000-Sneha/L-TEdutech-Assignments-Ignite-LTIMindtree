package Phase2.Week_5.ListActivity.Q10;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		ArrayList<Flight> arr = new ArrayList<Flight>();
		int count = 1;
		String ch, status, choice;
		do
		{
			System.out.println("1.Schedule Flight\n2.change status\n3.Display\n4.Exit");
			//System.out.println("Enter your options:");
			int op = Integer.parseInt(reader.nextLine());
            
			
			switch(op)
			{
				case 1:
							do
							{
								System.out.println("Enter the flights details :"+count);
								System.out.println("Enter the flight name:");
								String name = reader.nextLine();
								System.out.println("Enter the flight number:");
								String number = reader.nextLine();
								System.out.println("Enter the Status:");
								status = reader.nextLine();
								Flight obj = new Flight(name,number,status);
								arr.add(obj);
                                count++;
								System.out.println("Do you want to add more flight(Yes/No):");
								ch = reader.nextLine();
								
							}while(ch .equals("Yes"));
							break;
				case 2:
							do
							{
								System.out.println("Enter the flight number:");
								String flightNo = reader.nextLine();
                                //reader.nextLine();
								System.out.println("Enter the new status:");
								status = reader.nextLine();
								for(Flight obj : arr)
								{
									if(obj.getNumber().equals(flightNo))
									{
										obj.setStatus(status);
									}
								}

								System.out.println("Do you want to change status(Yes/No):");
								ch = reader.nextLine();
							}while(ch.equals("Yes"));
							break;
				case 3:
							System.out.println("Flight Status");
							for(Flight obj : arr)
							{
								System.out.println(obj.getNumber()+"\n"+obj.getStatus());
							}
							break;
				case 4:
							System.out.println("You are logged-out");
							System.exit(0);
			}
			System.out.println("Do you want to continue");
			choice = reader.nextLine();
		}while(choice.equals("Yes"));
    }
}
