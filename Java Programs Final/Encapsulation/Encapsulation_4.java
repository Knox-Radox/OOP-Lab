import java.time.LocalTime;
import java.util.Random;

class CursedDice {
    private int rollLimit;  // Maximum rolls per day
    private int rollsToday; // Rolls used today
    private boolean isCursed; // Whether the dice is cursed

    public CursedDice() {
        this.rollLimit = 5; // Max 5 rolls per day
        this.rollsToday = 0;
        this.isCursed = false;
    }

    public void rollDice() {
        checkReset(); 

        if (isCursed) {
            System.out.println("🔥 The dice refuses to roll. You are cursed!");
            return;
        }

        if (rollsToday >= rollLimit) {
            isCursed = true;
            System.out.println("You have angered the dice! A curse has been placed upon you!");
            return;
        }

        rollsToday++;
        int result = new Random().nextInt(6) + 1; // Roll between 1-6
        System.out.println("The dice rolls... You got a " + result + "! (" + rollsToday + "/" + rollLimit + " rolls used)");
    }

    public void performChant(String chant) {
        if (!isCursed) {
            System.out.println("The dice is not cursed. No need for a chant.");
            return;
        }

        if (chant.equalsIgnoreCase("oh mighty dice, forgive me")) {
            isCursed = false;
            rollsToday = 0;
            System.out.println("A mystical wind blows... The curse is lifted! The dice is pleased.");
        } else {
            System.out.println("The dice growls... That is NOT the correct chant!");
        }
    }

    private void checkReset() {
        if (LocalTime.now().getHour() == 0) {
            rollsToday = 0;
            System.out.println("The dice resets as the day begins anew...");
        }
    }
}

public class Encapsulation_4 {
    public static void main(String[] args) {
        CursedDice dice = new CursedDice();

        // Roll the dice 6 times (should trigger the curse on the last roll)
        dice.rollDice();
        dice.rollDice();
        dice.rollDice();
        dice.rollDice();
        dice.rollDice();
        dice.rollDice(); // Curse activated!

        // Trying to roll again after being cursed (should fail)
        dice.rollDice();

        // Trying the wrong chant
        dice.performChant("please forgive me");

        // Using the correct chant
        dice.performChant("oh mighty dice, forgive me");

        // Rolling again after curse is lifted
        dice.rollDice();
    }
}
