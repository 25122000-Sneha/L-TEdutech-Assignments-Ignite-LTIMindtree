package Phase2.Week_5.Generics.LearnGenerics;
import java.util.ArrayList;

public class MyCustomList<T> {
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T elem)
    {
        list.add(elem);
    }
    public void removeElement(T elem)
    {
        list.remove(elem);
    }
    public T getElement(int index)
    {
        return list.get(index);
    }
    
    @Override
    public String toString()
    {
        return list.toString();
    }
}
