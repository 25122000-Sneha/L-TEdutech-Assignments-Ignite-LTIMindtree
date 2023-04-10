package Phase2.Practice1.OOP.Q3;

public class Country {
    String name, countryCode, isdCode;
    Country(String name, String countryCode, String isdCode)
    {
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }
    void display()
    {
        System.out.println("Country Name : "+name);
        System.out.println("Country Code : "+countryCode);
        System.out.println("ISD Code : "+isdCode);
    }
}
