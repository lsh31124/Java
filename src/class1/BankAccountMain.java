package class1;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("나야", 10000);
        account.getInfo();
        account.deposit(5000);
        account.getInfo();
        account.withdraw(20000);
        account.withdraw(3000);
        account.getInfo();
    }
}
