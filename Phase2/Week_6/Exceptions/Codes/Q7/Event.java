package Phase2.Week_6.Exceptions.Codes.Q7;

public class Event {
    private String name, detail, ownerName;
    private long typeId;
    Event(String name, String detail, String ownerName, long typeId)
    {
        this.name = name;
        this.detail = detail;
        this.ownerName = ownerName;
        this.typeId = typeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public long getTypeId() {
        return typeId;
    }
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }
    public String toString()
    {
        return String.format("%-15s%-15s%-15s%-15s", this.name, this.detail, this.ownerName, this.typeId);
    }
}
