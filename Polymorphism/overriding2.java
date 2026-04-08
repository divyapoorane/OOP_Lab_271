class Order {
    void calculateBill() {
        System.out.println("Calculating bill");
    }
}

class DineIn extends Order {

    @Override
    void calculateBill() {
        int amount = 1000;
        System.out.println("Dine-In bill: " + (amount + amount * 0.05));
    }
}

class TakeAway extends Order {

    @Override
    void calculateBill() {
        int amount = 1000;
        System.out.println("TakeAway bill: " + amount);
    }
}

public class overriding2 {
    public static void main(String[] args) {

        Order o;

        o = new DineIn();
        o.calculateBill();

        o = new TakeAway();
        o.calculateBill();
    }
}
