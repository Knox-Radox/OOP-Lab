class Barista {
    private String name;

    public Barista(String name) {
        this.name = name;
        System.out.println("Barista " + name + " is ready to take your order!");
    }

    public void prepareCoffee() {
        System.out.println(name + " prepares a basic black coffee.");
    }

    public void prepareCoffee(String milkType) {
        System.out.println(name + " prepares a coffee with " + milkType + " milk.");
    }

    public void prepareCoffee(String milkType, int sugarSpoons) {
        System.out.println(name + " prepares a coffee with " + milkType + " milk and " + sugarSpoons + " spoon(s) of sugar.");
    }

    public void prepareCoffee(String milkType, int sugarSpoons, String extras) {
        System.out.println(name + " prepares a coffee with " + milkType + " milk, " + sugarSpoons + " spoon(s) of sugar, and " + extras + ".");
    }
}

public class MethodOverloading_2 {
    public static void main(String[] args) {
        Barista john = new Barista("John");

        john.prepareCoffee(); 
        john.prepareCoffee("almond"); 
        john.prepareCoffee("oat", 2); 
        john.prepareCoffee("soy", 1, "a shot of caramel syrup"); 
    }
}
