package Model;

public class Account
{
    private int account_ID;
    private String name;
    private double balance;

//    Métodos Getters
    public double getBalance()
    {
        return balance;
    }

    public int getAccount_ID()
    {
        return account_ID;
    }

    public String getName()
    {
        return name;
    }

//    Métodos Setters. En este caso no hay un setAccount_ID porque se asigna automáticamente
      public void setName(String name)
    {
        this.name = name;
    }

    public void Deposit(double money)
    {
        this.balance += money;
        System.out.println("Se han depositado $ " + money + " correctamente. \n Su saldo actual es $ " + getBalance());

    }

    public void Withdraw(double money)
    {
        if(this.getBalance() > money)
        {
            this.balance -= money;
            System.out.println("Usted ha retirado $ " + money + ". \n Su saldo actual es $ " + getBalance());
        }
        else
        {
            System.out.println("Lo sentimos. Usted no tiene dinero suficiente para realizar la operación.");
        }

    }

}
