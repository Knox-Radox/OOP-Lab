import java.util.Random;

abstract class AIEntity {
    abstract int attack(); 
}

class AggressiveAI extends AIEntity {
    Random random = new Random();

    int attack() {
        return random.nextInt(50, 101); 
    }
}

class DefensiveAI extends AIEntity {
    Random random = new Random();

    int attack() {
        return random.nextInt(20, 41); 
    }
}

public class AbstractClasses_2 {
    public static void main(String[] args) {
        AIEntity ai1 = new AggressiveAI();
        AIEntity ai2 = new DefensiveAI();

        int attack1 = ai1.attack();
        int attack2 = ai2.attack();

        System.out.println("Aggressive AI attacks with: " + attack1);
        System.out.println("Defensive AI attacks with: " + attack2);

        if (attack1 > attack2) {
            System.out.println("Aggressive AI Wins!");
        } else if (attack2 > attack1) {
            System.out.println("Defensive AI Wins!");
        } else {
            System.out.println("It's a Draw!");
        }
    }
}
