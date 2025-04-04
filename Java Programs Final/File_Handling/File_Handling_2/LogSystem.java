import java.io.*;

class Logger {
    private String logFile;

    public Logger(String logFile) {
        this.logFile = logFile;
    }

    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            writer.write(System.currentTimeMillis() + " - " + message);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Logging failed: " + e.getMessage());
        }
    }

    public void displayLogs() {
        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading logs: " + e.getMessage());
        }
    }
}

public class LogSystem {
    public static void main(String[] args) {
        Logger logger = new Logger("logs.txt");
        logger.log("Application started");
        logger.log("User logged in");
        logger.log("User performed an action");
        System.out.println("Log History:");
        logger.displayLogs();
    }
}
