package access.car;

public class Car {
    public String model;
    public int speed = 0;

    public Car(String model) {
        this.model = model;
    }

    public void speeUp() {
        if (speed + 10 <= 200) {
            speed++;
            System.out.println("가속! 현재 속도: " + speed);
        } else {
            System.out.println("경고: 최대 속도에 도달 했습니다!");
        }
    }

    public void speedDown() {
        if (speed - 10 >= 0) {
            speed--;
            System.out.println("감속 현재 속도: " + speed);
        } else {
            System.out.println("경과: 현재 속도는 0입니다!");
        }
    }

    public int getSpeed() {
        return speed;
    }


}
