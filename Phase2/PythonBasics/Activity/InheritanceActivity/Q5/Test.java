package Phase2.PythonBasics.Activity.InheritanceActivity.Q5;
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
