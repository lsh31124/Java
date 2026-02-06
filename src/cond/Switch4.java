package cond;

public class Switch4 {
    public static void main(String[] args) {
        //자바 14 부터 새로운 switch 문법 지원
        // -> break 문이 없어도 된다.
        // -> 화살표(->) 사용

        int grade =2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 = " + coupon);
    }
}
