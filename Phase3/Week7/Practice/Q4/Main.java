package Phase3.Week7.Practice.Q4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number of events");
        int n = Integer.parseInt(reader.nextLine());
        List<Event> arr = new ArrayList<Event>();
        System.out.println("Enter event details in format");
        for(int i=0; i<n; i++)
        {
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            Event obj = new Event(detailArr[0], detailArr[1], detailArr[2]);
            arr.add(obj);
        }
        EventBO ebo = new EventBO();
        ebo.saveToFile(arr);
    }
}
