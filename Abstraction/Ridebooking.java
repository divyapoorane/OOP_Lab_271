abstract class Ride {
    abstract void calculateFare(int distance);
}

class BikeRide extends Ride {

    @Override
    void calculateFare(int distance) {
        System.out.println("Bike Fare: " + (distance * 5));
    }
}

class CabRide extends Ride {

    @Override
    void calculateFare(int distance) {
        System.out.println("Cab Fare: " + (distance * 15));
    }
}

public class Ridebooking {
    public static void main(String[] args) {

        Ride r;

        r = new BikeRide();
        r.calculateFare(10);

        r = new CabRide();
        r.calculateFare(10);
    }
}
