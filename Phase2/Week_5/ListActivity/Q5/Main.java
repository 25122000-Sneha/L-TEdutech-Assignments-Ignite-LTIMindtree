package Phase2.Week_5.ListActivity.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		String detail;
		String[] detailArr;
		ArrayList<Hall> arr = new ArrayList<Hall>();
		char c;
		do
		{
            System.out.println("Action\n1.Add Hall\n2.Remove Hall");
            System.out.println("Enter your choice");
            int ch = reader.nextInt();
			switch(ch)
			{
				case 1:
                            reader.nextLine();
							System.out.println("Enter the Hall details in CSV format");
							detail = reader.nextLine();
							detailArr = detail.split(",");
							Hall h = new Hall(detailArr[0], detailArr[1], Double.parseDouble(detailArr[2]), detailArr[3]);
							arr.add(h);
							break;
				case 2:
                            //reader.nextLine();
							if(arr.isEmpty())
							{
								System.out.println("The list is empty");
								System.exit(0);
							}
							else
							{
								System.out.println("Enter the index of the hall to be removed");
								int index = reader.nextInt();
								arr.remove(index);
							}
							if(arr.isEmpty())
							{
								System.out.println("No Hall details to display");
                                reader.nextLine();
                            }
							else 
							{
								System.out.println("Hall name\tContact number\tCost per day\tOwner name");
								for(Hall obj : arr)
								{
									obj.display();
								}
                                reader.nextLine();
							}
							break;
				default:
							reader.nextLine();
							System.out.println("Please enter a valid choice");
							break;
			}
			System.out.println("Do you want to continue?(Y/N)");
			c = reader.nextLine().charAt(0);
		}while(c == 'Y');
    }
}
