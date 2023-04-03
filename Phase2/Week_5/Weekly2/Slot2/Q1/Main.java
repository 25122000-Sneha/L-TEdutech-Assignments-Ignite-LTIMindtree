package Phase2.Week_5.Weekly2.Slot2.Q1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        LinkedHashSet<Book> set = new LinkedHashSet<Book>();
        for(int i=0; i<n; i++)
        {
            int id = Integer.parseInt(reader.nextLine());
            String name = reader.nextLine();
            String author = reader.nextLine();
            String publisher = reader.nextLine();
            int quantity = Integer.parseInt(reader.nextLine());
            Book b = new Book(id, name, author, publisher, quantity);
            set.add(b);
        }
        String searchName = reader.nextLine();
        for(Book b : set)
        {
            System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuantity());

        }
        int flag = 0;
        for(Book b : set)
        {
            if(b.getName().equals(searchName))
            {
                flag++;
                System.out.println(searchName+" is present in the set");

            }
        }
        if(flag == 0)
        {
            System.out.println(searchName+" is not present in the set");
        }

    }
}
