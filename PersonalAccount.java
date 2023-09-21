import java.util.ArrayList;
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    public PersonalAccount(int accountNumber, String accountHolder){
        transactions = new ArrayList<Amount>();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void withdraw(double amount){
        if (balance > amount){
            balance = balance - amount;
            Amount amount2 = new Amount(amount, "withdraw");
            transactions.add(amount2);
        }
        else {
            System.out.println("Not enough balance");
        }
    }

    public void deposit(double amount){
        balance = balance + amount;
        Amount amount1 = new Amount(amount, "deposit");
        transactions.add(amount1);
    }

    public double getBalance(){
        return balance;
    }

    public void printTransactionHistory() {
        for (Amount element : transactions) {
            System.out.println("Transaction Type: " + element.getTransactionType() + ", Amount: " + element.getAmount());
        }
    }

}