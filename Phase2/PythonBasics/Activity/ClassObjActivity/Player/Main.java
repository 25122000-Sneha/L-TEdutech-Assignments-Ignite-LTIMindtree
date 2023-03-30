package Phase2.PythonBasics.Activity.ClassObjActivity.Player;
import java.util.*;
class Player{
    private String name, country;
	private Integer age;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return this.country;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Integer getAge()
	{
		return this.age;
	}
}
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter Name:");
		String n = reader.nextLine();
		System.out.println("Enter Age:");
		int a = reader.nextInt();
        reader.nextLine();
		System.out.println("Enter Country:");
		String c = reader.nextLine();

		Player p = new Player();
		p.setName(n);
		p.setAge(a);
		p.setCountry(c);

		System.out.println("Player Details:");
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Country:"+p.getCountry());
    }
}
