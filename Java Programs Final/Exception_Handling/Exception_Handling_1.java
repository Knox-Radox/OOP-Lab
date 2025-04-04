import java.util.Random;

class BuildSystem {
    static void compileCode() {
        int error = new Random().nextInt(3);
        if (error == 0) throw new ArithmeticException("Compilation failed: Division by zero in code.");
        if (error == 1) throw new NullPointerException("Null reference detected in build process.");
        System.out.println("Code compiled successfully.");
    }
}

class DeploymentSystem {
    static void deployApplication() {
        int crash = new Random().nextInt(4);
        if (crash == 0) throw new ArrayIndexOutOfBoundsException("Deployment error: Missing configuration files.");
        if (crash == 1) throw new IllegalStateException("Deployment interrupted due to unexpected shutdown.");
        System.out.println("Application deployed successfully.");
    }
}

class LoadBalancer {
    static void routeTraffic() {
        int fail = new Random().nextInt(5);
        if (fail == 0) throw new RuntimeException("Load balancer crashed: Too many incoming requests.");
        System.out.println("Traffic successfully routed.");
    }
}

public class Exception_Handling_1 {
    public static void main(String[] args) {
        System.out.println("Starting Software Deployment System...");

        try {
            System.out.println("\nBuilding Software...");
            BuildSystem.compileCode();

            try {
                System.out.println("\nDeploying Application...");
                DeploymentSystem.deployApplication();

                try {
                    System.out.println("\nRouting Traffic...");
                    LoadBalancer.routeTraffic();
                    System.out.println("\nDeployment Completed Successfully!");
                } catch (RuntimeException e) {
                    System.out.println("Load Balancer Error: " + e.getMessage());
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Deployment Failure: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Deployment Halted: " + e.getMessage());
            }

        } catch (ArithmeticException e) {
            System.out.println("Build Error: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Compilation Crash: " + e.getMessage());
        } finally {
            System.out.println("\nSystem Cleanup in Progress...");
        }

        System.out.println("\nDeployment Process Ended.");
    }
}
