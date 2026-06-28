PaymentStrategy.java

public interface PaymentStrategy {
    void pay(double amount);
}

CreditCardPayment.java

class CreditCardPayment implements PaymentStrategy {

    public void pay(double amount){
        System.out.println("Amount of Rs. "+ amount+" is paid using Credit Card");
    }
}


PayPalPayment.java

class PayPalPayment implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Amount of Rs. "+ amount+" is paid using PayPal");
    }
}


PaymentContext.java

public class PaymentContext{

   private PaymentStrategy paymentStrategy;

   public PaymentContext(PaymentStrategy paymentStrategy){
       this.paymentStrategy=paymentStrategy;
   }

   public void executePayment(double amount){
       paymentStrategy.pay(amount);
   }

}


StrategyPaymentExample.java

public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext payment1 = new PaymentContext(new CreditCardPayment());
        payment1.executePayment(1000.50);
        PaymentContext payment2 = new PaymentContext(new PayPalPayment());
        payment2.executePayment(3500.50);

    }
}


/*
Output
Amount of Rs. 1000.5 is paid using Credit Card
Amount of Rs. 3500.5 is paid using PayPal
*/
