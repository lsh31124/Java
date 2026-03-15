package poly.car1;


public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차 선택
        K3Car k3car = new K3Car();
        driver.setCar(k3car);
        driver.drive();

        //차 번경
        Model3Car model3car = new Model3Car();
        driver.setCar(model3car);
        driver.drive();

        //차 번경 newCar
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
