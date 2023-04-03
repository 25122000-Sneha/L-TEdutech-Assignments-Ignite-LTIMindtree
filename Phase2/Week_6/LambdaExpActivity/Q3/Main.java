package Phase2.Week_6.LambdaExpActivity.Q3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n = Integer.parseInt(reader.nextLine());
        ArrayList<User> arr = new ArrayList<User>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of User "+(i+1));
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            User obj = new User(detailArr[0], detailArr[1], detailArr[2], detailArr[3]);
            arr.add(obj);
        }
        //Collections.sort(arr, (obj1, obj2) -> {return obj1.getName().compareTo(obj2.getName());});
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println("The user details in reverse order:");
        System.out.printf("%-15s%-15s\n", "Name", "Mobile number");
        for(User obj : arr)
        {
            System.out.println(obj);
        }
    }
}
