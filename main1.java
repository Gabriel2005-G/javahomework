import java.util.Random;

public class main1 {
    public static void main1(String[] args) {

        Car car1 = new Car("Toyota", 5000, 20000);
        Car car2 = new Car("BMW", 8000, 30000);

        System.out.println("--- Testing " + car1.getBrand() + " ---");


        while (car1.canDrive()) {
            car1.drive();
        }

        System.out.println("Status: " + (car1.canDrive() ? "Ready to go!" : "Maintenance required."));


        System.out.println("\nChanging oils...");
        car1.changeEngineOil();
        car1.changeGearboxOil();

        System.out.println("Status after service: " + (car1.canDrive() ? "Ready to go!" : "Maintenance required."));
    }
}

class Car {
    private final String brand;
    private final double maxEngineOilMileage;
    private final double maxGearboxOilMileage;


    private double currentEngineOilMileage = 0;
    private double currentGearboxOilMileage = 0;

    private final Random random = new Random();

    public Car(String brand, double maxEngineOilMileage, double maxGearboxOilMileage) {
        this.brand = brand;
        this.maxEngineOilMileage = maxEngineOilMileage;
        this.maxGearboxOilMileage = maxGearboxOilMileage;
    }


    public void drive() {
        if (!canDrive()) {
            System.out.println("The car cannot be driven. Change oil first!");
            return;
        }
               double tripMileage = 50 + (450 * random.nextDouble());
        currentEngineOilMileage += tripMileage;
        currentGearboxOilMileage += tripMileage;
        System.out.printf("Driven %.2f km. Total since last service: Eng: %.2f, Gear: %.2f%n",
                tripMileage, currentEngineOilMileage, currentGearboxOilMileage);
    }


    public void changeEngineOil() {
        this.currentEngineOilMileage = 0;
        System.out.println("Engine oil changed. Mileage reset.");
    }


    public void changeGearboxOil() {
        this.currentGearboxOilMileage = 0;
        System.out.println("Gearbox oil changed. Mileage reset.");
    }


    public boolean canDrive() {
        return currentEngineOilMileage < maxEngineOilMileage &&
                currentGearboxOilMileage < maxGearboxOilMileage;
    }

    public String getBrand() {
        return brand;
    }
}

