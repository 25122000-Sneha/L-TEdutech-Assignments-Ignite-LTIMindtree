package Phase2.Week_6.StreamAPIActivity.Q2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the maximum price of the product");
        double price = reader.nextDouble();
        Product obj = new Product();
        List<Product> list = obj.filterProducts(price);
        if(list.isEmpty())
        {
            System.out.println("No products found within the given price");

        }
        else 
        {
            System.out.println("List of Filtered Products");
            System.out.printf("%-20s %-20s %-20s %-10s %s\n","Name","Brand","Category","Color","Price");
            for(Product o : list)
            {
                System.out.println(o);
            }
        }
    }
}
