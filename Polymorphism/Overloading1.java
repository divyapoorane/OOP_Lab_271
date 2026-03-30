class Payment {

    void pay(int amount) {
        System.out.println("Paid " + amount + " using Cash");
    }

    void pay(int amount, String cardType) {
        System.out.println("Paid " + amount + " using " + cardType + " Card");
    }

    void pay(int amount, String upi, String app) {
        System.out.println("Paid " + amount + " via UPI using " + app);
    }

    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay(500);
        p.pay(1000, "Credit");
        p.pay(750, "user@upi", "PhonePe");
    }
}
