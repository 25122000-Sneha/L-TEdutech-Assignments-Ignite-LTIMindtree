package Foundation.Activities.DataEncapsulationAndStaticActivity.Player;

import java.util.Scanner;

class  Player{
	private String name, country;
	private Integer age;
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(Integer age)
	{
		this.age = age;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setCountry(String country)
	{
		this.country = country;
	}
	public String getCountry()
	{
		return country;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = reader.nextLine();
		System.out.println("Enter Age:");
		int age = reader.nextInt();
		System.out.println("Enter Country:");
		String country = reader.next();
		System.out.println("Player Details:");

		Player p = new Player();
		p.setName(name);
		p.setAge(age);
		p.setCountry(country);
		System.out.println("Name:"+p.getName());
		System.out.println("Age:"+p.getAge());
		System.out.println("Country:"+p.getCountry());
    }
}
