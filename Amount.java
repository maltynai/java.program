public class Amount {
    private double amount;
    private String transactionType;
    public Amount(double amount, String transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
    public void setAmount(double a){
        amount = 0;
    }
    public double getAmount(){
        return amount;
    }

    public void setTransactionType(String t){
        transactionType = t;
    }

    public String getTransactionType(){
        return transactionType;
    }


}