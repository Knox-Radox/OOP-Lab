import java.io.*;

class FileVersionControl {
    private String filePath;

    public FileVersionControl(String filePath) {
        this.filePath = filePath;
    }

    public void writeVersion(String content) {
        int version = getLatestVersion() + 1;
        String versionedFile = filePath + ".v" + version;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(versionedFile))) {
            writer.write(content);
            System.out.println("Saved version " + version);
        } catch (IOException e) {
            System.out.println("Error writing version: " + e.getMessage());
        }
    }

    public void readVersion(int version) {
        String versionedFile = filePath + ".v" + version;
        File file = new File(versionedFile);
        if (!file.exists()) {
            System.out.println("Version " + version + " does not exist.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(versionedFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading version: " + e.getMessage());
        }
    }

    public int getLatestVersion() {
        int latestVersion = 0;
        File directory = new File(".");
        String[] files = directory.list();
        if (files != null) {
            for (String file : files) {
                if (file.startsWith(filePath + ".v")) {
                    try {
                        int version = Integer.parseInt(file.substring(filePath.length() + 2));
                        if (version > latestVersion) {
                            latestVersion = version;
                        }
                    } catch (NumberFormatException ignored) {}
                }
            }
        }
        return latestVersion;
    }
}

public class FileVersionApp {
    public static void main(String[] args) {
        FileVersionControl versionControl = new FileVersionControl("document");
        versionControl.writeVersion("First version of the document.");
        versionControl.writeVersion("Second version with some edits.");
        System.out.println("Reading latest version:");
        versionControl.readVersion(versionControl.getLatestVersion());
    }
}
