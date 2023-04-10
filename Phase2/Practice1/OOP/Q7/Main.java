package Phase2.Practice1.OOP.Q7;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String detail;
        String[] detailArr;
        System.out.println("Choose Stall Type\n1.Silver Stall\n2.Gold Stall\n3.Platinum Stall");
        int ch = Integer.parseInt(reader.nextLine());
        switch(ch)
        {
            case 1:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost)");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                SilverStall ss = new SilverStall(detailArr[0], detailArr[1], detailArr[2], Integer.parseInt(detailArr[3]));
                ss.display();
                break;
            case 2:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set)");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                GoldStall gs = new GoldStall(detailArr[0], detailArr[1], detailArr[2], Integer.parseInt(detailArr[3]), Integer.parseInt(detailArr[4]));
                gs.display();
                break;
            case 3:
                System.out.println("Enter Stall details in comma separated(Stall Name,Stall Description,Owner Name,Stall Cost,Number of TV set,Number of Projectors)");
                detail = reader.nextLine();
                detailArr = detail.split(",");
                PlatinumStall ps = new PlatinumStall(detailArr[0], detailArr[1], detailArr[2], Integer.parseInt(detailArr[3]), Integer.parseInt(detailArr[4]), Integer.parseInt(detailArr[5]));
                ps.display();
                break;
            default:
                System.exit(0);
        }
    }
}
