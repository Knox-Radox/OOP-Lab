
import java.util.Random;

class AuthenticationService {
    static void authenticateUser(String token) {
        if (token == null) throw new NullPointerException("Authentication failed: Missing token.");
        if (!token.equals("valid_token")) throw new SecurityException("Authentication failed: Invalid token.");
        System.out.println("User authenticated.");
    }
}

class UserService {
    static void getUserData() {
        if (new Random().nextInt(4) == 0) throw new RuntimeException("User Service Error: Database connection lost.");
        System.out.println("User data retrieved.");
    }
}

class PaymentService {
    static void processPayment() {
        if (new Random().nextInt(5) == 0) throw new ArithmeticException("Payment Error: Division by zero in transaction.");
        if (new Random().nextInt(6) == 0) throw new IllegalStateException("Payment Error: Transaction timeout.");
        System.out.println("Payment processed successfully.");
    }
}

public class Exception_Handling_2 {
    public static void main(String[] args) {
        System.out.println("API Gateway Started...");

        String[] tokens = {null, "invalid_token", "valid_token"};
        String userToken = tokens[new Random().nextInt(3)]; // Random token for testing

        try {
            System.out.println("\nAuthenticating User...");
            AuthenticationService.authenticateUser(userToken);

            try {
                System.out.println("\nFetching User Data...");
                UserService.getUserData();

                try {
                    System.out.println("\nProcessing Payment...");
                    PaymentService.processPayment();
                    System.out.println("\nAPI Request Completed Successfully!");
                } catch (ArithmeticException e) {
                    System.out.println("API Gateway Error: " + e.getMessage());
                } catch (IllegalStateException e) {
                    System.out.println("Payment Processing Error: " + e.getMessage());
                }

            } catch (RuntimeException e) {
                System.out.println("User Service Unavailable: " + e.getMessage());
            }

        } catch (NullPointerException e) {
            System.out.println("Authentication Error: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Authentication Denied: " + e.getMessage());
        } finally {
            System.out.println("\nClosing API Gateway Resources...");
        }

        System.out.println("\nAPI Gateway Shutdown.");
    }
}

