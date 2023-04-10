package Phase2.Practice1.Week5.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String detail;
        String[] detailArr;
        char choice;
        ArrayList<Hall> arr = new ArrayList<Hall>();
        do
        {
            System.out.println("Action\n1.Add Hall\n2.Remove Hall\nEnter your choice");
            int ch = Integer.parseInt(reader.nextLine());
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the Hall details in CSV format");
                    detail = reader.nextLine();
                    detailArr = detail.split(",");
                    Hall h = new Hall(detailArr[0], detailArr[1], Double.parseDouble(detailArr[2]), detailArr[3]);
                    arr.add(h);
                    break;
                case 2:
                    if(arr.isEmpty())
                    {
                        System.out.println("The list is Empty");
                        System.exit(0);
                    }
                    else 
                    {
                        System.out.println("Enter the index of the hall to be removed");
                        int index = Integer.parseInt(reader.nextLine());
                        arr.remove(index);
                        if(arr.isEmpty())
                        {
                            System.out.println("No Hall details to display");

                        }
                        else 
                        {
                            System.out.printf("%-20s%-20s%-20s%-20s\n", "Hall name", "Contact number", "Cost per day", "Owner name");
                            for(Hall obj : arr)
                            {
                                obj.display();
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
            System.out.println("Do you want to continue?(Y/N)");
            choice = reader.nextLine().charAt(0);
        }while(choice == 'Y');
    }
}
