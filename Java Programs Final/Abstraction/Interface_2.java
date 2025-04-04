import java.util.ArrayList;
import java.util.List;

interface Microservice {
    void startService();
    void stopService();
}

class UserService implements Microservice {
    public void startService() {
        System.out.println("[UserService] Started: Managing user accounts.");
    }

    public void stopService() {
        System.out.println("[UserService] Stopped.");
    }
}

class BillingService implements Microservice {
    public void startService() {
        System.out.println("[BillingService] Started: Processing payments.");
    }

    public void stopService() {
        System.out.println("[BillingService] Stopped.");
    }
}

class NotificationService implements Microservice {
    public void startService() {
        System.out.println("[NotificationService] Started: Sending emails & SMS.");
    }

    public void stopService() {
        System.out.println("[NotificationService] Stopped.");
    }
}

class ServiceOrchestrator {
    private List<Microservice> services = new ArrayList<>();

    void registerService(Microservice service) {
        services.add(service);
        System.out.println("Registered: " + service.getClass().getSimpleName());
    }

    void startAllServices() {
        System.out.println("\nStarting All Microservices...");
        for (Microservice service : services) {
            service.startService();
        }
    }

    void stopAllServices() {
        System.out.println("\nStopping All Microservices...");
        for (Microservice service : services) {
            service.stopService();
        }
    }
}

public class Interface_2 {
    public static void main(String[] args) {
        ServiceOrchestrator orchestrator = new ServiceOrchestrator();

        orchestrator.registerService(new UserService());
        orchestrator.registerService(new BillingService());
        orchestrator.registerService(new NotificationService());

        orchestrator.startAllServices();

        orchestrator.stopAllServices();
    }
}
