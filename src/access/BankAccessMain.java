package access;

public class BankAccessMain {
    public static void main(String[] args) {
        BankAccess account = new BankAccess();
        account.deposit(-10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}
