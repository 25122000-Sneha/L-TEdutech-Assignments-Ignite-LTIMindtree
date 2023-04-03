package Phase2.Week_5.Weekly2.Slot2.Q1;

public class Book {
    private Integer id, quantity;
    private String name, author, publisher;
    public Book(int id, String name, String author, String publisher, int quantity)
    {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
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
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;

    }
    public int getQuantity()
    {
        return this.quantity;
    }

}
