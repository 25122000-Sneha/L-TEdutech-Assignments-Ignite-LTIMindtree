package Phase2.Practice1.Week5.Q18;
class Airport{
    private String iataAirportCode, name, city;
    Airport(String iataAirportCode, String name, String city)
    {
        this.iataAirportCode = iataAirportCode;
        this.name = name;
        this.city = city;
    }
    public String getIataAirportCode() {
        return iataAirportCode;
    }
    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    
}