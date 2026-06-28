Stock.java
  
public interface Stock {
    void register(Observer observer);
    void deRegister(Observer observer);
    void notifyObserver();
}

Observer.java

public interface Observer {
    void update(String stockName, double price);
}

StockMarket.java

import java.util.ArrayList;
import java.util.List;
public class StockMarket implements Stock{

     private List<Observer> observers = new ArrayList<>();
     private String stockName;
     private double price;

     public void register(Observer observer){
         observers.add(observer);
     }

     public void deRegister(Observer observer){
         observers.remove(observer);
     }

     public void notifyObserver(){
         for(Observer observer:observers){
             observer.update(stockName, price);
         }
     }

     public void setStock(String stockName, double price){
         this.stockName=stockName;
         this.price=price;

         notifyObserver();
     }

}

MobileApp.java

public class MobileApp implements Observer{
    public void update(String stockName, double price) {
          System.out.println("Mobile App: " + stockName + " = Rs " + price);
    }
}

WebApp.java
  
public class WebApp implements Observer{
    public void update(String stockName, double price){
        System.out.println("WebApp: "+stockName+" = Rs. "+price);
    }
}


ObserverPatternExample.java
  
public class ObserverPatternExample {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStock("CTS", 2500);
        market.setStock("TCS", 7500);
        System.out.println();

        market.deRegister(web);

        market.setStock("Cognizant", 3500);

    }
}


/*
output:
Mobile App: CTS = Rs 2500.0
WebApp: CTS = Rs. 2500.0
Mobile App: TCS = Rs 7500.0
WebApp: TCS = Rs. 7500.0

Mobile App: Cognizant = Rs 3500.0
*/


