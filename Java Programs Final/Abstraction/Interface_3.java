import java.util.ArrayList;
import java.util.List;

interface EventListener {
    void onEvent(String event);
}

class MessageBroker {
    private List<EventListener> listeners = new ArrayList<>();

    void subscribe(EventListener listener) {
        listeners.add(listener);
        System.out.println(listener.getClass().getSimpleName() + " subscribed to events.");
    }

    void publish(String event) {
        System.out.println("\nPublishing Event: " + event);
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}

class OrderService implements EventListener {
    private MessageBroker broker;

    OrderService(MessageBroker broker) {
        this.broker = broker;
        this.broker.subscribe(this);
    }

    void createOrder(String orderID) {
        System.out.println("Order Created: " + orderID);
        broker.publish("OrderPlaced: " + orderID);
    }

    public void onEvent(String event) {
    }
}

class InventoryService implements EventListener {
    InventoryService(MessageBroker broker) {
        broker.subscribe(this);
    }

    public void onEvent(String event) {
        if (event.startsWith("OrderPlaced")) {
            System.out.println("Inventory Updated for: " + event.split(": ")[1]);
        }
    }
}

class ShippingService implements EventListener {
    ShippingService(MessageBroker broker) {
        broker.subscribe(this);
    }

    public void onEvent(String event) {
        if (event.startsWith("OrderPlaced")) {
            System.out.println("Shipping Order: " + event.split(": ")[1]);
        }
    }
}

public class Interface_3 {
    public static void main(String[] args) {
        MessageBroker broker = new MessageBroker();

        OrderService orderService = new OrderService(broker);
        new InventoryService(broker);
        new ShippingService(broker);

        orderService.createOrder("ORD12345");
    }
}
