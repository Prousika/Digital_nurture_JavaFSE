Notifier.java

interface Notifier{
    void send(String message);
}

EmailNotifier.java

public class EmailNotifier implements Notifier{

    public void send(String message){
        System.out.println("Email sent: "+message);
    }
}

NotifierDecorator.java
  
abstract class NotifierDecorator implements Notifier{

    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    public void send(String message){
        notifier.send(message);
    }
}

SmsNotifierDecorator.java

public class SmsNotifierDecorator extends NotifierDecorator {

    public SmsNotifierDecorator(Notifier notifier){
        super(notifier);
    }
    public void send(String message){
        super.send(message);
        System.out.println("SMS sent: "+message);
    }
}

SlackNotifierDecorator.java
  
public class SlackNotifierDecorator extends NotifierDecorator{

    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    public void send(String message){
        super.send(message);
        System.out.println("Slack Notification sent: "+message);

    }
}

DecoratorPatternExample.java

public class DecoratorPatternExample {
    public static void main(String[] args){
        Notifier notifier = new EmailNotifier();
        notifier = new SmsNotifierDecorator(notifier);
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("Meeting at 2 PM");
    }
}


/*
output
Email sent: Meeting at 2 PM
SMS sent: Meeting at 2 PM
Slack Notification sent: Meeting at 2 PM
*/
