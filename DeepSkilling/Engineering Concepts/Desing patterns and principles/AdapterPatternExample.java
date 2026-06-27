PaymentProcessor.java

//target interface
interface PaymentProcessor{
    void processPayment(double amount);
}

PayPal.java

// Paypal adaptee class
public class PayPal {
     public void sendPayment(double amount){
         System.out.println("Payment of Rs."+amount+" is processed by PayPal");
     }
}

RazorPay.java

//Razorpay Adaptee class
public class RazorPay {
    public void makePayment(double amount){
        System.out.println("Payment of Rs."+ amount+ " is processed by RazorPay");
    }
}

PaypalAdapter.java

// Paylpal Adapter Class
public class PaypalAdapter implements PaymentProcessor{
    private PayPal paypal;

    public PaypalAdapter(){
        paypal = new PayPal();
    }
    public void processPayment(double amount){
        paypal.sendPayment(amount);
    }
}


RazorpayAdapter.java

// Razorpay Adapter Class
public class RazorpayAdapter implements PaymentProcessor{

    private RazorPay razorpay;
    public RazorpayAdapter(){
        razorpay = new RazorPay();
    }
    public void processPayment(double amount){
         razorpay.makePayment(amount);
    }
}

AdapterPatternExample.java

//test class
public class AdapterPatternExample {
    public static void main(String[] args){
        PaymentProcessor paypal = new PaypalAdapter();
        paypal.processPayment(5000.00);

        PaymentProcessor razorpay = new RazorpayAdapter();
        razorpay.processPayment(2500.50);
    }
}


/*
OUTPUT:
Payment of Rs.5000.0 is processed by PayPal
Payment of Rs.2500.5 is processed by RazorPay
*/
