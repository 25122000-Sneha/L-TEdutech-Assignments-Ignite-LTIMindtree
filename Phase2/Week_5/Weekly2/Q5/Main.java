package Phase2.Week_5.Weekly2.Q5;
import java.util.*;
class Book{
    private Integer id;
    private String name, author, publisher;
    private Integer quantity;
    Book(){}
    public Book(Integer id, String name, String author, String publisher, Integer quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public Integer getId()
    {
        return this.id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public String getPublisher()
    {
        return this.publisher;
    }
    public void setQuantity(Integer quantity)
    {
        this.quantity = quantity;
    }
    public Integer getQuantity()
    {
        return this.quantity;
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.author+" "+this.publisher+" "+this.quantity;
    }

}

public class Main{
    public static void main(String[] args)
    {
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
            Book obj = new Book(id, name, author, publisher, quantity);
            set.add(obj);
        }
        String searchName = reader.nextLine();
        for(Book b : set)
        {
            System.out.println(b);
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
/*
2
1
let us c
yashwanth
BPB
8
2
operating systems
galvin
wiley
6
 */

