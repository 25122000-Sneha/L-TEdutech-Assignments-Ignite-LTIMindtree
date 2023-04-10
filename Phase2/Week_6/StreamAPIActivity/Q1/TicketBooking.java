package Phase2.Week_6.StreamAPIActivity.Q1;

public class TicketBooking {
    private String customerName;
    private Integer noOfTickets;
    private double price;
    TicketBooking(){}
    TicketBooking(String customerName, Integer noOfTickets, double price)
    {
        this.customerName = customerName;
        this.noOfTickets = noOfTickets;
        this.price = price;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Integer getNoOfTickets() {
        return noOfTickets;
    }
    public void setNoOfTickets(Integer noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override 
    public String toString()
    {
        return String.format("%-10s %-15s %-15s", this.customerName, this.noOfTickets, this.price);
    }
}
