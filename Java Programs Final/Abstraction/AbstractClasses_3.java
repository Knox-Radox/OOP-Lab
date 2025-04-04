abstract class Alien {
    abstract void speak(); 
}

class Martian extends Alien {
    void speak() {
        System.out.println("Martian: Beep Boop Bzzzt!");
    }
}

class Venusian extends Alien {
    void speak() {
        System.out.println("Venusian: Hmmmmmmm...");
    }
}

class Jovian extends Alien {
    void speak() {
        System.out.println("Jovian: GRRRRRRROOOOAAARRR!");
    }
}

public class AbstractClasses_3 {
    public static void main(String[] args) {
        Alien martian = new Martian();
        Alien venusian = new Venusian();
        Alien jovian = new Jovian();

        martian.speak();
        venusian.speak();
        jovian.speak();
    }
}
