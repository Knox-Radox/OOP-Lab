class MusicPlayer {
    void play() {
        System.out.println("Playing music...");
    }

    void play(String songName) {
        System.out.println("Playing: " + songName);
    }

    void play(String songName, String artist) {
        System.out.println("Playing: " + songName + " by " + artist);
    }
}

class MP3Player extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Playing music from MP3 player...");
    }
}

class StreamingService extends MusicPlayer {
    @Override
    void play() {
        System.out.println("Streaming music online...");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        MusicPlayer player1 = new MusicPlayer();
        MusicPlayer player2 = new MP3Player();
        MusicPlayer player3 = new StreamingService();

        player1.play();
        player2.play();
        player3.play();

        System.out.println("\n--- Method Overloading Showcase ---");

        player1.play("Sithira Puthiri");
        player1.play("Blinding Lights", "The Weeknd");
    }
}
