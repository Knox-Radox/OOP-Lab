class SmartDevice {
    protected String deviceName;
    protected boolean isOn;

    public SmartDevice(String name) {
        this.deviceName = name;
        this.isOn = false; 
    }

    public void turnOn() {
        isOn = true;
        System.out.println(deviceName + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(deviceName + " is now OFF.");
    }

    public void showStatus() {
        System.out.println(deviceName + " Status: " + (isOn ? "ON" : "OFF"));
    }
}

class SmartLight extends SmartDevice {
    private String color;

    public SmartLight(String name, String color) {
        super(name);
        this.color = color;
    }

    public void changeColor(String newColor) {
        if (isOn) {
            color = newColor;
            System.out.println(deviceName + " color changed to " + color);
        } else {
            System.out.println("Turn ON " + deviceName + " to change color.");
        }
    }

    public void showLightStatus() {
        showStatus();
        System.out.println("Light Color: " + color);
    }
}

class SmartThermostat extends SmartDevice {
    private int temperature;

    public SmartThermostat(String name, int temp) {
        super(name);
        this.temperature = temp;
    }

    public void setTemperature(int temp) {
        if (isOn) {
            temperature = temp;
            System.out.println(deviceName + " temperature set to " + temperature + "°C.");
        } else {
            System.out.println("Turn ON " + deviceName + " to set temperature.");
        }
    }

    public void showThermostatStatus() {
        showStatus();
        System.out.println("Temperature: " + temperature + "°C");
    }
}

public class HierarchialInheritance_1 {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Living Room Light", "White");
        SmartThermostat thermostat = new SmartThermostat("Bedroom Thermostat", 24);

        System.out.println("\n Smart Home Automation System\n");

        light.turnOn();
        light.changeColor("Blue");
        light.showLightStatus();

        thermostat.turnOn();
        thermostat.setTemperature(22);
        thermostat.showThermostatStatus();

        light.turnOff();
        thermostat.turnOff();
    }
}
