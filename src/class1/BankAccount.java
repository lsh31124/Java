package class1;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println("입금완료");
    }

    public void withdraw(int amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("출금완료");
        }else{
            System.out.println("잔액부족");
        }
    }

    public void getInfo() {
        System.out.println(this.owner + "님 잔액:" + this.balance);
            
    }
}
