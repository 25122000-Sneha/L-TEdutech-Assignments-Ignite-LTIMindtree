package Phase2.Week_5.Practice.ArrayList.Q5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Hall> arr = new ArrayList<Hall>();
        char ch;
        do{
            System.out.println("Action\n1.Add Hall\n2.Remove Hall");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(reader.nextLine());
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Hall details in CSV format");
                    String d = reader.nextLine();
                    String[] dArr = d.split(",");
                    Hall h = new Hall(dArr[0], dArr[1], Double.parseDouble(dArr[2]), dArr[3]);
                    arr.add(h);
                    break;
                case 2:
                    if(arr.isEmpty())
                    {
                        System.out.println("The list is empty");
                        System.exit(0);
                    }
                    else 
                    {
                        System.out.println("Enter the index of the hall to be removed");
                        int in = Integer.parseInt(reader.nextLine());
                        arr.remove(in);
                        if(arr.isEmpty())
                        {
                            System.out.println("No Hall details to display");
                        }
                        else 
                        {
                            System.out.printf("%-20s%-20s%-20s%-20s", "Hall name", "Contact number", "Cost per day", "Owner name");
                            for(Hall obj : arr)
                            {
                                obj.display();
                                System.out.println();
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;

            }
            System.out.println("Do you want to continue?(Y/N)");
            ch = reader.nextLine().charAt(0);

        }while(ch == 'Y');

    }
}
