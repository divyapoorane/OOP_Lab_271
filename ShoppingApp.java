class ShoppingApp {
    public static void main(String[] args) {

        byte quantity = 3;                  
        short orderYear = 2025;             
        int orderId = 458921;                
        long trackingNumber = 987654321098L;
        float itemWeight = 1.25f;          
        double totalPrice = 2499.99;       
        char deliveryType = 'E';             
        boolean isDelivered = false;         

        System.out.println("Quantity: " + quantity);
        System.out.println("Order Year: " + orderYear);
        System.out.println("Order ID: " + orderId);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Item Weight: " + itemWeight + " kg");
        System.out.println("Total Price: ₹" + totalPrice);
        System.out.println("Delivery Type: " + deliveryType);
        System.out.println("Delivered: " + isDelivered);
    }
}
