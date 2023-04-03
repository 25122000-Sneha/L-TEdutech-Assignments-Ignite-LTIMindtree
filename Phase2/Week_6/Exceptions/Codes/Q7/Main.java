package Phase2.Week_6.Exceptions.Codes.Q7;
import java.util.*;
public class Main {
    public static boolean isValid(Long typeId, List<EventType> typeList) throws EventTypeDoesNotExistsException
    {
        int flag = 0;
        for(EventType et : typeList)
        {
            if(typeId == et.getId())
            {
                flag++;
                return true;
            }
        }
        if(flag == 0)
        {
            throw new EventTypeDoesNotExistsException("No event type available with the given id");
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of the events:");
        int n = Integer.parseInt(reader.nextLine());
        
        List<EventType> arr = new ArrayList<EventType>();
        arr.add(new EventType("Stage event", 1));
        arr.add(new EventType("Exhibition", 2));
        arr.add(new EventType("Sports meet", 3));
        ArrayList<Event> eventList = new ArrayList<Event>();
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the details of event "+(i+1));
            String detail = reader.nextLine();
            String[] detailArr = detail.split(",");
            
            long typeId = Long.parseLong(detailArr[3]);
            //System.out.println(typeId);
            while(true)
            {
                try{
                    if(isValid(typeId, arr))
                    {
                        //System.out.println(typeId);
                        Event obj = new Event(detailArr[0], detailArr[1], detailArr[2], typeId);
                        eventList.add(obj);
                        break;

                    }
                }
                catch(EventTypeDoesNotExistsException ex)
                {
                    System.out.println(ex.getClass().getName()+": "+ex.getMessage());
                    System.out.println("Enter the correct event type id:");
                    typeId = Long.parseLong(reader.nextLine());
                }
            }


        }
        System.out.println("The events entered are:");
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Details", "Owner name", "Event typeid");
        for(Event obj : eventList)
        {
            System.out.println(obj);
        }
    }
}

