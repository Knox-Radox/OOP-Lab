import java.util.Random;

class DatasetLoader {
    static void loadDataset() {
        if (new Random().nextInt(4) == 0) throw new RuntimeException("Dataset Corrupted: Unable to load training data.");
        System.out.println("Dataset loaded successfully.");
    }
}

class ModelTrainer {
    static void trainModel(int attempt) {
        int failureType = new Random().nextInt(6);

        if (failureType == 0) throw new ArithmeticException("Training Error: NaN detected in loss function.");
        if (failureType == 1) throw new IllegalStateException("Training Diverged: Gradient explosion.");
        if (failureType == 2 && attempt < 2) throw new RuntimeException("GPU Crash: Overheating detected.");
        
        System.out.println("AI Model trained successfully on attempt " + attempt + "!");
    }
}

public class Exception_Handling_3 {
    public static void main(String[] args) {
        System.out.println("AI Model Training Pipeline Started...");

        try {
            System.out.println("\nLoading Dataset...");
            DatasetLoader.loadDataset();

            int attempts = 0;
            while (attempts < 3) {
                try {
                    attempts++;
                    System.out.println("\nTraining Model (Attempt " + attempts + ")...");
                    ModelTrainer.trainModel(attempts);
                    System.out.println("\nAI Model Training Completed Successfully!");
                    break;
                } catch (ArithmeticException | IllegalStateException e) {
                    System.out.println("Model Training Failed: " + e.getMessage());
                    if (attempts < 3) System.out.println("Retrying training with adjusted parameters...");
                } catch (RuntimeException e) {
                    System.out.println("Critical Error: " + e.getMessage());
                    if (attempts < 3) System.out.println("Cooling down GPU and retrying...");
                    else throw new RuntimeException("AI Model Training Aborted After 3 Attempts.");
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Fatal Error: " + e.getMessage());
        } finally {
            System.out.println("\nShutting Down AI Training System...");
        }

        System.out.println("\nAI Training Pipeline Stopped.");
    }
}
