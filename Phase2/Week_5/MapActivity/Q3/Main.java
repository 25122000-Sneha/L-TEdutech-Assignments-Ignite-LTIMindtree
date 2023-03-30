package Phase2.Week_5.MapActivity.Q3;
import java.util.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Map<String, ArrayList<CallLog>> customerMap = new HashMap<String, ArrayList<CallLog>>();
        try 
        {
            FileInputStream fs = new FileInputStream("D:\\Internship\\Phase2\\Week_5\\MapActivity\\Q3\\input.txt");
            Scanner reader = new Scanner(fs);
            while(reader.hasNextLine())
            {
                String callLog = reader.nextLine();
                String[] callLogArr = callLog.split(",");
                String email = callLogArr[0];
                CallLog obj = new CallLog(callLogArr[1], sdf.parse(callLogArr[2]), sdf.parse(callLogArr[3]));
                if(customerMap.containsKey(email))
                {
                    ArrayList<CallLog> arr = customerMap.get(email);
                    arr.add(obj);
                    customerMap.put(email, arr);
                }
                else 
                {
                    ArrayList<CallLog> arr = new ArrayList<CallLog>();
                    arr.add(obj);
                    customerMap.put(email, arr);

                }
            }
            
        } 
        catch (IOException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        TreeMap<String, ArrayList<CallLog>> sortedMap = new TreeMap<String, ArrayList<CallLog>>(customerMap); 
        for(Map.Entry<String,ArrayList<CallLog>> e : sortedMap.entrySet())
        {
            System.out.println("Calls made by "+e.getKey()+" :");
            for(CallLog obj : e.getValue())
            {
                System.out.print("Number Called : "+obj.getPhoneNo()+" Call Time:"+sdf.format(obj.getStartTime()));
                System.out.println();
            }
        }
    }
}
