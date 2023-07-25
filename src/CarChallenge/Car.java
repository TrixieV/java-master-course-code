package CarChallenge;

public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("CarChallenge.Car -> start engine");
    }

    public void drive() {
        System.out.println("CarChallenge.Car -> drive. Type: " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("CarChallenge.Car -> run engine");
    }


}

class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter,
                         int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas power car is starting");
    }

    @Override
    protected void runEngine() {
        System.out.println("Gas engine is running");
    }
}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge,
                       int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("Driving electric car");
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric engine is running");
    }
}

class HybridCar extends Car {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double avgKmPerLiter,
                     int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid car is starting");
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("Driving hybrid car");
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid engine is running");
    }
}










