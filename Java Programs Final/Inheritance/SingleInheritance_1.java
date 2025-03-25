package Inheritance;
class Appliance {
    protected String brand;
    protected int powerRating; 
    protected int usageHours; 

    public Appliance(String brand, int powerRating, int usageHours) {
        this.brand = brand;
        this.powerRating = powerRating;
        this.usageHours = usageHours;
    }

    public double calculateEnergyConsumption() {
        return (powerRating * usageHours) / 1000.0; 
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Rating: " + powerRating + "W");
        System.out.println("Usage per Day: " + usageHours + " hours");
        System.out.println("Daily Energy Consumption: " + calculateEnergyConsumption() + " kWh");
    }
}

class SmartFridge extends Appliance {
    private int temperature;
    private int itemCount;
    
    public SmartFridge(String brand, int powerRating, int usageHours, int temperature, int itemCount) {
        super(brand, powerRating, usageHours);
        this.temperature = temperature;
        this.itemCount = itemCount;
    }

    public void adjustTemperature(int newTemp) {
        this.temperature = newTemp;
        System.out.println("Temperature set to " + newTemp + "C");
    }

    public void updateInventory(int change) {
        this.itemCount += change;
        if (this.itemCount < 0) this.itemCount = 0;
        System.out.println("Updated item count: " + this.itemCount);
    }
}

public class SingleInheritance_1 {
    public static void main(String[] args) {
        Appliance basicAppliance = new Appliance("Generic", 1000, 5);
        System.out.println("Basic Appliance");
        basicAppliance.displayDetails();
        System.out.println();

        SmartFridge fridge = new SmartFridge("CoolTech", 150, 24, 3, 10);
        System.out.println("Smart Fridge");
        fridge.displayDetails();
        System.out.println();

        fridge.adjustTemperature(2);
        fridge.updateInventory(-3); 
        System.out.println();

        fridge.displayDetails();
    }
}
