import java.util.ArrayList;
import java.util.List;

abstract class Plugin {
    abstract void execute(); 
}

class LoggingPlugin extends Plugin {
    void execute() {
        System.out.println("[LOG] System activity recorded.");
    }
}

class SecurityPlugin extends Plugin {
    void execute() {
        System.out.println("[SECURITY] Security verification completed.");
    }
}

class Application {
    private List<Plugin> plugins = new ArrayList<>();

    void loadPlugin(Plugin plugin) {
        plugins.add(plugin);
        System.out.println("Plugin loaded: " + plugin.getClass().getSimpleName());
    }

    void runPlugins() {
        System.out.println("\nExecuting Plugins...");
        for (Plugin plugin : plugins) {
            plugin.execute();
        }
    }
}

public class AbstractClasses_4 {
    public static void main(String[] args) {
        Application app = new Application();

        app.loadPlugin(new LoggingPlugin());
        app.loadPlugin(new SecurityPlugin());

        app.runPlugins();
    }
}
