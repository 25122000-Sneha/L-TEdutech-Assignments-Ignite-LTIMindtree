package Phase2.Week_5.CompActivity.Q2;
import java.text.SimpleDateFormat;
import java.util.*;
public class Transaction {
    private long id, receiver_account_id, sender_account_id;
    private double amount;
    private String location, status;
    private Date transaction_date;
    Transaction(){}
    Transaction(long id, double amount, String location, String status, Date transaction_date, long receiver_account_id, long sender_account_id)
    {
        this.id = id;
        this.amount = amount;
        this.location = location;
        this.status = status;
        this.transaction_date = transaction_date;
        this.receiver_account_id = receiver_account_id;
        this.sender_account_id = sender_account_id;
    }
    public long getId() {
        return id;
    }
    public void setIs(long id) {
        this.id = id;
    }
    public long getReceiver_account_id() {
        return receiver_account_id;
    }
    public void setReceiver_account_id(long receiver_account_id) {
        this.receiver_account_id = receiver_account_id;
    }
    public long getSender_account_id() {
        return sender_account_id;
    }
    public void setSender_account_id(long sender_account_id) {
        this.sender_account_id = sender_account_id;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getTransaction_date() {
        return transaction_date;
    }
    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }
    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n",this.getId(), this.getAmount(), this.getLocation(), this.getStatus(), sdf.format(this.getTransaction_date()), this.getReceiver_account_id(), this.getSender_account_id() );
    }
}
