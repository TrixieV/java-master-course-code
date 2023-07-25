package CarChallenge;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        runRace(car);

        ElectricCar car1 = new ElectricCar("Ferrari",
                2000, 30);
        GasPoweredCar car2 = new GasPoweredCar("VWG",
                4000, 60);
        HybridCar car3 = new HybridCar("Honda", 5000,
                80, 70);

        runRace(car1);
        runRace(car2);
        runRace(car3);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
        System.out.println();
    }
}
