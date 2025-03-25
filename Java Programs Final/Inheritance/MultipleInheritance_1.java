package Inheritance;
interface Speaker {
    void speak(String message);
}

interface Navigator {
    void navigateTo(String location);
}

class RobotAssistant implements Speaker, Navigator {
    private String name;

    public RobotAssistant(String name) {
        this.name = name;
    }

    public void speak(String message) {
        System.out.println(name + " says: " + message);
    }

    public void navigateTo(String location) {
        System.out.println(name + " is navigating to " + location + "...");
        simulatePathFinding(location);
    }

    private void simulatePathFinding(String location) {
        System.out.println("Calculating optimal route to " + location + "...");
        System.out.println("Following shortest path...");
        System.out.println(name + " has arrived at " + location + "!");
    }

    public void showStatus() {
        System.out.println("Assistant Name: " + name);
        System.out.println("Capabilities: Voice Communication & Navigation");
    }
}

public class MultipleInheritance_1{
    public static void main(String[] args) {
        RobotAssistant assistant = new RobotAssistant("AlphaBot");

        System.out.println("=== Robot Assistant Initialized ===");
        assistant.showStatus();
        System.out.println();

        assistant.speak("Hello! How can I assist you?");
        assistant.navigateTo("Library");
        System.out.println();

        assistant.speak("I can also help you find your way!");
        assistant.navigateTo("Cafeteria");
    }
}
