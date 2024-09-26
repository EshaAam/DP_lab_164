
public class Rider {
    private int id;
    private String name;
    private String location;
    private double rating;

    // Constructor
    public Rider(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
//        this.rating = rating;
    }

    // Basic methods to get information
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public Trip requestRide(Driver driver, String dropOffLocation, RideType rideType) {
        System.out.println(name + " is requesting a ride.");
        double baseFare = 10.0; // Assume base fare
        double fare = rideType.calculateFare(5.0, baseFare); // Assume 5.0 km distance
        return new Trip(id, this, driver, location, dropOffLocation, rideType.getClass().getSimpleName(), fare);
    }

    public void setPaymentMethod(Trip trip, PaymentMethod paymentMethod) {
        trip.setPaymentMethod(paymentMethod);
    }

    // Method for rating a driver
//    public void rateDriver(Driver driver, double rating) {
//        System.out.println(name + " is rating driver " + driver.getName() + " with " + rating + " stars.");
//        driver.updateRating(rating);
//    }
}