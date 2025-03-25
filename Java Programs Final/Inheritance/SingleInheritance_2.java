package Inheritance;
class TrafficLight {
    protected String currentColor;
    protected int defaultTime; 

    public TrafficLight(String initialColor, int defaultTime) {
        this.currentColor = initialColor;
        this.defaultTime = defaultTime;
    }

    public void changeLight(String newColor) {
        this.currentColor = newColor;
        System.out.println("Traffic light changed to: " + newColor);
    }

    public int getLightDuration() {
        return defaultTime;
    }

    public void displayStatus() {
        System.out.println("Current Light: " + currentColor);
        System.out.println("Default Duration: " + defaultTime + " seconds");
    }
}

class SmartTrafficLight extends TrafficLight {
    private int vehicleCount; 
    public SmartTrafficLight(String initialColor, int defaultTime, int vehicleCount) {
        super(initialColor, defaultTime); // Call parent constructor
        this.vehicleCount = vehicleCount;
    }

    public void adjustTiming() {
        if (vehicleCount > 20) {
            defaultTime += 10; 
        } else if (vehicleCount < 5) {
            defaultTime -= 5; 
        }
        if (defaultTime < 10) {
            defaultTime = 10;
        } 
        System.out.println("Adjusted light duration: " + defaultTime + " seconds based on traffic.");
    }

    public void updateTraffic(int newVehicleCount) {
        this.vehicleCount = newVehicleCount;
        System.out.println("Updated vehicle count: " + vehicleCount);
        adjustTiming();
    }

    public void displayStatus() {
        super.displayStatus();
        System.out.println("Detected Vehicles: " + vehicleCount);
    }
}

public class SingleInheritance_2 {
    public static void main(String[] args) {
        TrafficLight basicLight = new TrafficLight("Red", 30);
        System.out.println("Basic Traffic Light");
        basicLight.displayStatus();
        basicLight.changeLight("Green");
        System.out.println();

        SmartTrafficLight smartLight = new SmartTrafficLight("Red", 30, 25);
        System.out.println("Smart Traffic Light");
        smartLight.displayStatus();
        System.out.println();

        smartLight.updateTraffic(10); 
        smartLight.updateTraffic(3);  
        smartLight.changeLight("Green");
        System.out.println();

        smartLight.displayStatus();
    }
}
