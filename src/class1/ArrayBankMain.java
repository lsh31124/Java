package class1;

public class ArrayBankMain {
    public static void main(String[] args) {
        int sum =0;
        int maxBalance = 0;
        String maxName = "";
        BankAccount[] accounts = {
                new BankAccount("홍길동", 50000),
                new BankAccount("김영희", 80000),
                new BankAccount("박철수", 30000)
        };

        for (BankAccount account : accounts) {
            sum += account.balance;
            if (account.balance > maxBalance) {
                maxBalance = account.balance;
                maxName = account.owner;

            }

        }
        System.out.println("전체 잔액 합계" + sum + "원");
        System.out.println("최고 부자: "+ maxName);
    }
}
