import java.io.*;

class FileMetadataManager {
    private File file;

    public FileMetadataManager(String filePath) {
        this.file = new File(filePath);
    }

    public void createFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }

    public void displayMetadata() {
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + file.lastModified());
        } else {
            System.out.println("File does not exist.");
        }
    }
}

public class FileMetadataApp {
    public static void main(String[] args) {
        FileMetadataManager manager = new FileMetadataManager("info.txt");
        manager.createFile();
        manager.displayMetadata();
    }
}
