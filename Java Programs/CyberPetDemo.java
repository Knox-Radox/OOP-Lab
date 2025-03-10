class CyberPet {
    String model;
    int batteryLevel;

    CyberPet(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    void checkBattery() {
        System.out.println(model + " Battery Level: " + batteryLevel + "%");
    }

    void recharge() {
        batteryLevel = 100;
        System.out.println(model + " is fully recharged!");
    }
}

class RoboDog extends CyberPet {
    String agilityLevel;

    RoboDog(String model, int batteryLevel, String agilityLevel) {
        super(model, batteryLevel); // Calling CyberPet constructor
        this.agilityLevel = agilityLevel;
    }

    void performTrick() {
        if (batteryLevel > 10) {
            System.out.println(model + " performs a backflip! 🤖🐕");
            batteryLevel -= 10;
        } else {
            System.out.println(model + " has low battery! Recharge required.");
        }
    }
}

class AICompanion extends RoboDog {
    String aiPersonality;

    AICompanion(String model, int batteryLevel, String agilityLevel, String aiPersonality) {
        super(model, batteryLevel, agilityLevel);
        this.aiPersonality = aiPersonality;
    }

    void checkBattery() {
        System.out.println(model + " (" + aiPersonality + " AI): My battery level is " + batteryLevel + "%.");
    }

    void chat() {
        System.out.println(model + " (" + aiPersonality + " AI): How can I assist you today? 😊");
    }
}

public class CyberPetDemo {
    public static void main(String[] args) {
        AICompanion myRobot = new AICompanion("CyberPup-X", 50, "High", "Friendly");

        myRobot.checkBattery();   
        myRobot.performTrick();   
        myRobot.chat();           
        myRobot.recharge();       
        myRobot.checkBattery();   
    }
}
