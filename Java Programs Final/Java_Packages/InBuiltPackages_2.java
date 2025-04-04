import java.util.*;
import java.time.*;

public class InBuiltPackages_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Memory Training Game!");
        System.out.print("Enter the number of digits to memorize: ");
        int numDigits = scanner.nextInt();

        List<Integer> numbers = generateNumbers(numDigits, random);
        System.out.println("\nMemorize this sequence:");
        displayNumbers(numbers);

        delay(3000);  
        clearScreen();

        System.out.println("Now enter the numbers in order:");

        Instant startTime = Instant.now();

        List<Integer> userInput = new ArrayList<>();
        for (int i = 0; i < numDigits; i++) {
            userInput.add(scanner.nextInt());
        }

        Instant endTime = Instant.now();
        long timeTaken = Duration.between(startTime, endTime).toSeconds();

        int score = evaluateScore(numbers, userInput);
        System.out.println("\n🎯 Your Score: " + score + "/" + numDigits);
        System.out.println("⏳ Time taken: " + timeTaken + " seconds");

        if (score == numDigits) {
            System.out.println("Perfect memory! You're a genius!");
        } else if (score > numDigits / 2) {
            System.out.println("Good job! Keep practicing!");
        } else {
            System.out.println("Keep training your brain!");
        }

        scanner.close();
    }

    private static List<Integer> generateNumbers(int count, Random random) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(10));  
        }
        return numbers;
    }

    private static void displayNumbers(List<Integer> numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void delay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static int evaluateScore(List<Integer> original, List<Integer> input) {
        int score = 0;
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i).equals(input.get(i))) {
                score++;
            }
        }
        return score;
    }
}
