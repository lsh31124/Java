package access.car;

public class DrivingApp {
    public static void main(String[] args) {
        Car myCar = new Car("제니시스");

        myCar.speeUp();
        myCar.speeUp();
        myCar.speedDown();
//        myCar.speed = 500; // 직접 접근 불가

        System.out.println(myCar.model + "의 최종 속도: " + myCar.getSpeed());
    }
}
