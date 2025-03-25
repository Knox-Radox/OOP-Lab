class Reality {
    public String describeReality() {
        return "Reality is what it is.";
    }
}

class NormalPerson extends Reality {
    public String describeReality() {
        return "I see trees, buildings, and people going about their day.";
    }
}

class Dreamer extends Reality {
    public String describeReality() {
        return "The sky is painted with liquid gold, and the roads whisper ancient songs.";
    }
}

class AI extends Reality {
    public String describeReality() {
        return "Reality is a collection of structured data, processed and stored in a neural matrix.";
    }
}

class Alien extends Reality {
    public String describeReality() {
        return "Kzzt! Reality is an oscillating waveform collapsing into quantum bananas.";
    }
}

public class MethodOverriding_1 {
    public static void main(String[] args) {
        Reality r1 = new NormalPerson();
        Reality r2 = new Dreamer();
        Reality r3 = new AI();
        Reality r4 = new Alien();

        System.out.println("\n--- How Different Entities Perceive Reality ---");
        System.out.println("Normal Person: " + r1.describeReality());
        System.out.println("Dreamer: " + r2.describeReality());
        System.out.println("AI: " + r3.describeReality());
        System.out.println("Alien: " + r4.describeReality());
    }
}
