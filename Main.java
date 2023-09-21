public class Main {
    public static void main(String[] args) {
        PersonalAccount p = new PersonalAccount(2201, "Altynai");
        p.deposit(235);
        p.deposit(457);
        p.withdraw(100);
        p.withdraw(40);
        System.out.println("Total: " +p.getBalance());
        p.printTransactionHistory();

    }
}