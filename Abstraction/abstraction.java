abstract class Notification {

    // abstract method
    abstract void send(String message);
}

// Email Notification
class EmailNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

// SMS Notification
class SMSNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

// Push Notification
class PushNotification extends Notification {

    @Override
    void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

public class abstraction {
    public static void main(String[] args) {

        Notification n;

        n = new EmailNotification();
        n.send("Hello via Email");

        n = new SMSNotification();
        n.send("Hello via SMS");

        n = new PushNotification();
        n.send("Hello via App Notification");
    }
}