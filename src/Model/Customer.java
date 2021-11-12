package Model;

public class Customer
{
    private int customer_ID;
    private int account_ID;
    private String name;

    private Account account;

    public int getCustomer_ID() {
        return customer_ID;
    }

    public int getAccount_ID() {
        return account_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance()
    {
        return this.account.getBalance();
    }

    public void Deposit (double amount)
    {
        this.account.Deposit(amount);
    }

    public void Withdraw(double amount)
    {
        this.account.Withdraw(amount);
    }

}
