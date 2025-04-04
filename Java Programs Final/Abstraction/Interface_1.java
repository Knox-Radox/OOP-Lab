interface PaymentProcessor {
    void processPayment(double amount); 
}

class CreditCard implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount);
    }
}

// Implementation of PayPal payment
class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of $" + amount);
    }
}

class CryptoWallet implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing Crypto Payment of $" + amount + " in Bitcoin");
    }
}

class PaymentSystem {
    public static void makePayment(PaymentProcessor paymentMethod, double amount) {
        paymentMethod.processPayment(amount);
    }
}

public class Interface_1 {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCard();
        PaymentProcessor paypal = new PayPal();
        PaymentProcessor crypto = new CryptoWallet();

        PaymentSystem.makePayment(creditCard, 150.75);
        PaymentSystem.makePayment(paypal, 89.99);
        PaymentSystem.makePayment(crypto, 0.005); 
    }
}
