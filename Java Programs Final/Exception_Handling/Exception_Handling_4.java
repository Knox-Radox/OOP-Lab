class PluginLoadException extends Exception {
    public PluginLoadException(String message) {
        super(message);
    }
}

class PluginExecutionException extends Exception {
    public PluginExecutionException(String message) {
        super(message);
    }
}

class SoftwarePluginManager {
    private boolean pluginExists;
    private boolean executionFails;

    public SoftwarePluginManager(boolean pluginExists, boolean executionFails) {
        this.pluginExists = pluginExists;
        this.executionFails = executionFails;
    }

    public void loadPlugin() throws PluginLoadException {
        if (!pluginExists) {
            throw new PluginLoadException("Plugin not found. Cannot load.");
        }
        System.out.println("Plugin loaded successfully.");
    }

    public void executePlugin() throws PluginExecutionException {
        if (executionFails) {
            throw new PluginExecutionException("Plugin execution failed due to an internal error.");
        }
        System.out.println("Plugin executed successfully.");
    }
}

public class Exception_Handling_4 {
    public static void main(String[] args) {
        SoftwarePluginManager pluginManager = new SoftwarePluginManager(true, false);

        try {
            pluginManager.loadPlugin();
            pluginManager.executePlugin();
        } catch (PluginLoadException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PluginExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Plugin system shutting down.");
        }
    }
}
