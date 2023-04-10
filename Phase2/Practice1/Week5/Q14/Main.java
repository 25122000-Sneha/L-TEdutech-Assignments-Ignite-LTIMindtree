package Phase2.Practice1.Week5.Q14;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no of values in list 1");
        int no1 = reader.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println("Enter values");
        for(int i=0; i<no1; i++)
        {
            list1.add(reader.nextInt());
        }
        System.out.println("Enter no of values in list 2");
        int no2 = reader.nextInt();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println("Enter values");
        for(int i=0; i<no2; i++)
        {
            list2.add(reader.nextInt());
        }
        TreeSet<Integer> set1 = new TreeSet<Integer>(list1);
        TreeSet<Integer> set2 = new TreeSet<Integer>(list2);
        System.out.println("Set1");
        for(Integer each : set1)
        {
            System.out.println(each);
        }
        System.out.println("Set 2");
        for(Integer each : set2)
        {
            System.out.println(each);
        }
        set1.addAll(set2);
        
        System.out.println("Union");
        for(Integer each : set1)
        {
            System.out.println(each);
        }


    }
}
