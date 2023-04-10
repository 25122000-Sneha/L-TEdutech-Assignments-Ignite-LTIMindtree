package Phase2.Practice1.Week5.Q32;

public class Transaction {
    private String accountNumber;
    private Double amount;
    Transaction(String accountNumber, Double amount)
    {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public boolean validate(Double transactionAmount) throws Exception
    {
        if((transactionAmount > amount) || (amount < 500.0))
        {
            throw new Exception("Insufficient Balance");

        }
        else 
        {
            this.amount -= transactionAmount;
            return true;
        }

    }
}
