package Phase2.Practice1.OOP.Q6;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String detail;
        String[] detailArr;
        System.out.println("Choose Event type\n1.Exhibition\n2.StageEvent");
        int ch = Integer.parseInt(reader.nextLine());
        switch(ch)
        {
            case 1:
                System.out.println("Enter the details in CSV format");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                Exhibition obj1 = new Exhibition(detailArr[0], detailArr[1], detailArr[2], detailArr[3], Integer.parseInt(detailArr[4]));
                obj1.display();
                break;
            case 2:
                System.out.println("Enter the details in CSV format");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                StageEvent obj2 = new StageEvent(detailArr[0], detailArr[1], detailArr[2], detailArr[3], Integer.parseInt(detailArr[4]));
                obj2.display();
                break;
            default:
                System.out.println("Invallid choice");
                System.exit(0);
        }
    }
}
