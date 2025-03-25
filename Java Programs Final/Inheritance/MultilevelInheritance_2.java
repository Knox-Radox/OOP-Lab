package Inheritance;
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) speed = 0;
        System.out.println(brand + " slowed down to " + speed + " km/h");
    }
}

class Car extends Vehicle {
    protected boolean airConditioning;

    public Car(String brand, int speed, boolean airConditioning) {
        super(brand, speed);
        this.airConditioning = airConditioning;
    }

    public void toggleAC() {
        airConditioning = !airConditioning;
        System.out.println("Air Conditioning turned " + (airConditioning ? "ON" : "OFF"));
    }
}

class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, int speed, boolean airConditioning, int batteryLevel) {
        super(brand, speed, airConditioning);
        this.batteryLevel = batteryLevel;
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > 100) batteryLevel = 100;
        System.out.println("Battery charged to " + batteryLevel + "%");
    }

    public void showStatus() {
        System.out.println("\n=== Vehicle Status ===");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Air Conditioning: " + (airConditioning ? "ON" : "OFF"));
        System.out.println("Battery Level: " + batteryLevel + "%\n");
    }
}

public class MultilevelInheritance_2 {
    public static void main(String[] args) {
        System.out.println("\n Smart Vehicle System n");

        ElectricCar myCar = new ElectricCar("Tesla", 0, false, 50);

        myCar.accelerate(60);
        myCar.toggleAC();
        myCar.chargeBattery(30);
        myCar.brake(20);
        myCar.showStatus();
    }
}
