import java.time.LocalTime;  // To check the time

class HauntedSafe {
    private String secretItem;  // Hidden item inside
    private String safeCode;    // Unlock code
    private boolean isHaunted;  // Keeps track of haunt status
    private int failedAttempts; // Tracks failed code attempts

    public HauntedSafe(String safeCode, String secretItem) {
        this.safeCode = safeCode;
        this.secretItem = secretItem;
        this.isHaunted = false;
        this.failedAttempts = 0;
    }

    public void openSafe(String enteredCode) {
        if (isHaunted) {
            System.out.println("👻 The safe whispers: 'I shall never open again... You are cursed!'");
            return;
        }

        // Check if it's midnight (only then it allows opening)
        int hour = LocalTime.now().getHour();
        if (hour != 0) { // Not midnight
            System.out.println("The safe refuses to open. Try at midnight.");
            return;
        }

        if (enteredCode.equals(safeCode)) {
            System.out.println("The safe creaks open... Inside, you find: " + secretItem);
            failedAttempts = 0; 
        } else {
            failedAttempts++;
            System.out.println("Wrong code! Attempts left: " + (3 - failedAttempts));

            if (failedAttempts == 3) {
                isHaunted = true;
                System.out.println("The safe shakes violently... A ghost appears! The safe is now haunted forever!");
            }
        }
    }

    public void performRitual(String ritualPhrase) {
        if (!isHaunted) {
            System.out.println("The safe is not haunted... no need for a ritual.");
            return;
        }

        if (ritualPhrase.equalsIgnoreCase("begone spirit")) {
            isHaunted = false;
            failedAttempts = 0;
            System.out.println("The ghost vanishes... The safe is purified and can be used again.");
        } else {
            System.out.println("💀 The ghost laughs... That is NOT the correct ritual phrase!");
        }
    }
}

public class Encapsulation_3 {
    public static void main(String[] args) {
        HauntedSafe safe = new HauntedSafe("darkMagic42", "An ancient cursed ring 💍");

        safe.openSafe("darkMagic42");

        safe.openSafe("wrong1");
        safe.openSafe("wrong2");
        safe.openSafe("wrong3"); // Ghost appears!

        safe.openSafe("darkMagic42");

        safe.performRitual("go away ghost");

        safe.performRitual("begone spirit");

        safe.openSafe("darkMagic42");
    }
}
