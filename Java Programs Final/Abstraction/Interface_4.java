interface Microservice {
    void handleRequest(String request);
}

class OrderService implements Microservice {
    public void handleRequest(String request) {
        System.out.println("Order Service: Processing " + request);
    }
}

class PaymentService implements Microservice {
    public void handleRequest(String request) {
        System.out.println("Payment Service: Processing " + request);
    }
}

class ShippingService implements Microservice {
    public void handleRequest(String request) {
        System.out.println("Shipping Service: Processing " + request);
    }
}

class APIGateway {
    private Microservice orderService = new OrderService();
    private Microservice paymentService = new PaymentService();
    private Microservice shippingService = new ShippingService();

    void routeRequest(String path, String request) {
        if (path.equals("/order")) {
            orderService.handleRequest(request);
        } else if (path.equals("/payment")) {
            paymentService.handleRequest(request);
        } else if (path.equals("/shipping")) {
            shippingService.handleRequest(request);
        } else {
            System.out.println("404 - Service Not Found for: " + path);
        }
    }
}

public class Interface_4 {
    public static void main(String[] args) {
        APIGateway gateway = new APIGateway();

        gateway.routeRequest("/order", "Order #12345");
        gateway.routeRequest("/payment", "Payment for Order #12345");
        gateway.routeRequest("/shipping", "Shipping Order #12345");
        gateway.routeRequest("/inventory", "Inventory Check");
    }
}
