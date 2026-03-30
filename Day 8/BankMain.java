class Bank{
    private double balance = 0;
    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
        }
        else
            System.out.println("Balance not enough!");
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited amount: " + amount);
    }
    public double getBalance(){
        return balance;
    }
}

public class BankMain {  
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(1000);
        bank.withdraw(200);
        System.out.println(bank.getBalance());
    }  
}
