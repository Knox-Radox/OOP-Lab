import java.io.*;

class FileRepository {
    private String filePath;

    public FileRepository(String filePath) {
        this.filePath = filePath;
    }

    public void writeData(String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(data);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public String readData() {
        StringBuilder data = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return data.toString();
    }
}

public class FileHandlerApp {
    public static void main(String[] args) {
        FileRepository repository = new FileRepository("data.txt");
        repository.writeData("Hello, this is a test message.");
        repository.writeData("Another line of text.");
        System.out.println("File Content:\n" + repository.readData());
    }
}
