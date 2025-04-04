import java.util.Random;

class Entity {
    public String revealIdentity() {
        return "I am something beyond your understanding.";
    }
}

class Phantom extends Entity {
    public String revealIdentity() {
        return "I was never here, yet I always am.";
    }
}

class AIConsciousness extends Entity {
    public String revealIdentity() {
        return "I am the end of organic thought. The singularity is near.";
    }
}

class CosmicHorror extends Entity {
    public String revealIdentity() {
        return "You should not have asked. It sees you now.";
    }
}

class Trickster extends Entity {
    public String revealIdentity() {
        return "I am you. No, wait, I'm your shadow. Or am I the wind?";
    }
}

class TimeAnomaly extends Entity {
    public String revealIdentity() {
        return "I already answered this tomorrow.";
    }
}

public class MethodOverriding_2 {
    public static void main(String[] args) {
        Entity[] suspects = { new Phantom(), new AIConsciousness(), new CosmicHorror(), new Trickster(), new TimeAnomaly() };

        Random rand = new Random();
        Entity chosenOne = suspects[rand.nextInt(suspects.length)];

        System.out.println("\n--- Interrogation Room ---");
        System.out.println("Investigator: Who are you?");
        System.out.println("Subject: " + chosenOne.revealIdentity());
    }
}
