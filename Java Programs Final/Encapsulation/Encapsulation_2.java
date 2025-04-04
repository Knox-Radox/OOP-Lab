class CursedDiary {
    private String secret;       // The hidden message
    private String password;     // The secret password
    private boolean isWritten;   // Checks if an entry exists
    private int failedAttempts;  // Tracks wrong password attempts

    public CursedDiary(String password) {
        this.password = password;
        this.secret = "";
        this.isWritten = false;
        this.failedAttempts = 0;
    }

    public void writeSecret(String newSecret) {
        if (isWritten) {
            System.out.println("The diary refuses to be rewritten today! Try tomorrow.");
        } else {
            this.secret = newSecret;
            this.isWritten = true;
            System.out.println("Your secret has been stored safely.");
        }
    }

    public void readSecret(String attemptPassword) {
        if (failedAttempts >= 3) {
            System.out.println("The diary has self-destructed! All secrets are lost forever.");
            return;
        }

        if (attemptPassword.equals(password)) {
            System.out.println("The diary whispers: " + secret);
        } else {
            failedAttempts++;
            System.out.println("Wrong password! Attempts left: " + (3 - failedAttempts));

            if (failedAttempts == 3) {
                System.out.println("The diary starts burning... *POOF* It self-destructs!");
                this.secret = "";
            }
        }
    }

    public void resetForNewDay() {
        isWritten = false;
        System.out.println("A new day has begun. The diary is ready for another secret.");
    }
}

public class Encapsulation_2 {
    public static void main(String[] args) {
        CursedDiary diary = new CursedDiary("mystic123");

        diary.writeSecret("I saw a UFO last night! 🤫");

        diary.writeSecret("I changed my mind...");

        diary.readSecret("wrongPass1");
        diary.readSecret("wrongPass2");
        diary.readSecret("wrongPass3"); // This should self-destruct!

        diary.readSecret("mystic123");

        diary.resetForNewDay();
        diary.writeSecret("I actually met an alien! 👽");
        diary.readSecret("mystic123");
    }
}
