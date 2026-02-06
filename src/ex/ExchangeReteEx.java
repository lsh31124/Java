package ex;

public class ExchangeReteEx {
    public static void main(String[] args) {
        int dollar =20;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다");
        } else if (dollar ==0) {
            System.out.println("환전한 금액 없음");
        }else{
            int won = dollar * 1300;
            System.out.println("환전 금액은"+won+"원입니다");
        }
    }
}
