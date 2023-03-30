package Phase2.Week_5.CompActivity.Q1;

public class Account {
    private Integer accId;
    private double accBalance;
    private String accNum, status, accType, custId;
    Account()
    {

    }
    Account(Integer accId, double accBalance, String accNum, String status, String accType, String custId)
    {
        this.accId = accId;
        this.accBalance = accBalance;
        this.accNum = accNum;
        this.status = status;
        this.accType = accType;
        this.custId = custId;
    }

    public Integer getAccId() {
        return accId;
    }
    public void setAccId(Integer accId) {
        this.accId = accId;
    }
    public double getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getAccType() {
        return accType;
    }
    public void setAccType(String accType) {
        this.accType = accType;
    }
    public String getCustId() {
        return custId;
    }
    public void setCustId(String custId) {
        this.custId = custId;
    }
    @Override
    public String toString()
    {
        return String.format("%-20s %-20s %-20s %-20s %-20s %-20s", accId, accNum, accBalance, accType, status, custId); 
    }

    
}
