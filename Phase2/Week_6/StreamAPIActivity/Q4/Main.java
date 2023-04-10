package Phase2.Week_6.StreamAPIActivity.Q4;
import java.util.*;
import java.util.stream.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<Employee>();
        try{
            FileInputStream fs = new FileInputStream("D:/Internship/Phase2/Week_6/StreamAPIActivity/Q4/input.txt");
            Scanner reader = new Scanner(fs);
            while(reader.hasNextLine())
            {
                String detail = reader.nextLine();
                String[] detailArr = detail.split(",");
                Employee emp = new Employee(detailArr[0], Double.parseDouble(detailArr[1]));
                arr.add(emp);

            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("Name"+"\t"+"Salary");
        List<Employee> newList = arr.parallelStream().collect(Collectors.toList());
        newList.stream().forEach(n -> System.out.println(n));
    }
}
