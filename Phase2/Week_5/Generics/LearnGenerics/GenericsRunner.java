package Phase2.Week_5.Generics.LearnGenerics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class GenericsRunner{
    static<X> X doubleValue(X value)
    {
        return value;
    }
    static<X extends List> void duplicate(X list)
    {
        list.addAll(list);
    }
    public static void main(String[] args) {
        
        String val = doubleValue(new String());
        Integer num1 = doubleValue(Integer.valueOf(9));
        ArrayList arr = doubleValue(new ArrayList());
        
        ArrayList numbers = new ArrayList<>(List.of(1,2,3)); //to make list modifiable we use new ArrayList(List.of(1,2,3))
                                                                    //because List.of(1,2,3) creates an unmodifiable list
        
        duplicate(numbers);
        LinkedList numbers2 = new LinkedList<>(List.of(1,2,3));

        System.out.println(numbers);
        
        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("Rahul");
        list1.addElement("Julie");
        String value = list1.getElement(0);
        //System.out.println(list1);
        System.out.println(value);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(Integer.valueOf(7));
        list2.addElement(Integer.valueOf(8));
        Integer number = list2.getElement(0);
        //System.out.println(list2);
        System.out.println(number);
    }
}