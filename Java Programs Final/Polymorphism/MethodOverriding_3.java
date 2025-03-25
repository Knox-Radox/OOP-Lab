import java.util.Random;

class Clock {
    public String tellTime() throws Exception {
        return "The time is ticking...";
    }
}

class NormalClock extends Clock {
    public String tellTime() {
        return "It's exactly 3:15 PM.";
    }
}

class LazyClock extends Clock {
    public String tellTime() throws Exception {
        throw new Exception("Too lazy to check the time...");
    }
}

class ParanoidClock extends Clock {
    public String tellTime() throws Exception {
        throw new Exception("I can't tell you the time. They're watching...");
    }
}

class PoeticClock extends Clock {
    public String tellTime() {
        return "The sun kisses the horizon, and shadows grow long.";
    }
}

class GlitchedClock extends Clock {
    private Random rand = new Random();
    
    public String tellTime() throws Exception {
        if (rand.nextBoolean()) {
            throw new Exception("SYSTEM ERROR: Time overflow detected!");
        }
        return "TIME SYNC FAILED... Please reboot.";
    }
}

public class MethodOverriding_3 {
    public static void main(String[] args) {
        Clock[] clocks = { new NormalClock(), new LazyClock(), new ParanoidClock(), new PoeticClock(), new GlitchedClock() };

        for (Clock clock : clocks) {
            try {
                System.out.println(clock.getClass().getSimpleName() + ": " + clock.tellTime());
            } catch (Exception e) {
                System.out.println(clock.getClass().getSimpleName() + " ERROR: " + e.getMessage());
            }
        }
    }
}
