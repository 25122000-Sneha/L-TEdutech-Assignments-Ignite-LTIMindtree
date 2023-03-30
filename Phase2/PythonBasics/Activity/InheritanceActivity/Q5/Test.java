package Phase2.PythonBasics.Activity.InheritanceActivity;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String names = reader.nextLine();
        String[] arr = names.split(",");
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
