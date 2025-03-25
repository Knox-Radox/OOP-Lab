import java.util.Random;

class Animal {
    public String makeSound() throws Exception {
        return "Some generic animal sound...";
    }
}

class Dog extends Animal {
    public String makeSound() {
        return "Woof! Woof!";
    }
}

class Cat extends Animal {
    public String makeSound() {
        return "Meow!";
    }
}

class LazyCat extends Animal {
    public String makeSound() throws Exception {
        throw new Exception("Too lazy to meow... Zzz...");
    }
}

class MuteParrot extends Animal {
    public String makeSound() throws Exception {
        throw new Exception("This parrot has taken a vow of silence.");
    }
}

class GlitchyRobotDog extends Animal {
    private Random rand = new Random();

    public String makeSound() throws Exception {
        if (rand.nextBoolean()) {
            throw new Exception("SYSTEM ERROR: Robotic bark module failure!");
        }
        return "Beep-Boop! Woof!";
    }
}

public class MethodOverriding_4 {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new LazyCat(), new MuteParrot(), new GlitchyRobotDog() };

        for (Animal animal : animals) {
            try {
                System.out.println(animal.getClass().getSimpleName() + ": " + animal.makeSound());
            } catch (Exception e) {
                System.out.println(animal.getClass().getSimpleName() + " ERROR: " + e.getMessage());
            }
        }
    }
}

