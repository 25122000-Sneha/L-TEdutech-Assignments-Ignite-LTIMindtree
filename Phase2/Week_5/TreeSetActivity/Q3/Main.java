package Phase2.Week_5.TreeSetActivity.Q3;
import java.util.*;
class DescendingItemCost implements Comparator<Item>{
    @Override
    public int compare(Item i1, Item i2)
    {
        return Integer.compare(i2.getAmount(), i1.getAmount());
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String ch;
        TreeSet<Item> set = new TreeSet<Item>(new DescendingItemCost());
            
        do{
            System.out.println("Enter item");
            String name = reader.nextLine();
            System.out.println("Enter amount(Dinar)");
            int amt = reader.nextInt();
            Item obj = new Item(name, amt);
            set.add(obj);
            reader.nextLine();
            System.out.println("Do you want to continue(yes/no):");
            ch = reader.nextLine();
        }while(ch.equals("yes"));
        System.out.println("Total dinar required is:");
        System.out.println("Item\t\tAmount(Dinar)");
        int sum = 0;
        for(Item obj : set)
        {
            sum += obj.getAmount();
            System.out.println(obj.getName()+"\t\t"+obj.getAmount());
        }
        System.out.println("Total amount needed in Dinar:"+sum);
        double rupees = sum*18.565;
        System.out.println("Total amount needed in Rupees:"+String.format("%.2f",rupees));

    }
}
