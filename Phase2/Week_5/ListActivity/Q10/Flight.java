package Phase2.Week_5.ListActivity.Q10;

public class Flight {
    private String name, number, status;
    
    Flight(String name, String number, String status) {
        this.name = name;
        this.number = number;
        this.status = status;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
