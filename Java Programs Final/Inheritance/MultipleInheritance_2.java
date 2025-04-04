interface CustomerSupport {
    void receiveQuery(String customerName, String query);
}

interface AutomatedResponse {
    void generateResponse(String query);
}

class AIAssistant implements CustomerSupport, AutomatedResponse {
    private String assistantName;

    public AIAssistant(String name) {
        this.assistantName = name;
    }

    @Override
    public void receiveQuery(String customerName, String query) {
        System.out.println("\n" + assistantName + ": Query received from " + customerName);
        System.out.println("Query: " + query);
        generateResponse(query);
    }

    @Override
    public void generateResponse(String query) {
        System.out.print(assistantName + ": Response -> ");
        
        if (query.toLowerCase().contains("price")) {
            System.out.println("The product price varies. Please check our website for details.");
        } else if (query.toLowerCase().contains("refund")) {
            System.out.println("Refunds are processed within 5-7 business days.");
        } else if (query.toLowerCase().contains("delivery")) {
            System.out.println("Delivery usually takes 3-5 working days.");
        } else {
            System.out.println("Our support team will contact you shortly.");
        }
    }

    public void showAssistantInfo() {
        System.out.println(assistantName + " AI Customer Support");
        System.out.println("Capabilities: Query Handling & Automated Responses");
    }
}

public class MultipleInheritance_2 {
    public static void main(String[] args) {
        AIAssistant assistant = new AIAssistant("ChatBot");

        assistant.showAssistantInfo();

        assistant.receiveQuery("Alice", "What is the price of this item?");
        assistant.receiveQuery("Bob", "How long does delivery take?");
        assistant.receiveQuery("Charlie", "I want a refund for my order.");
        assistant.receiveQuery("David", "I have a technical issue.");
    }
}
