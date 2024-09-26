public class RideSharingApp {
    public static void main(String[] args) {
        // Create a rider
        Rider rider = new Rider(1, "Alice", "Downtown");

        // Create a driver
        Driver driver = new Driver(1, "Bob", "Sedan", "Uptown", 4.8, true);

        // Rider requests a carpool ride
        RideType carpoolRide = new CarpoolRide();
        Trip trip = rider.requestRide(driver, "City Center", carpoolRide);

        // Driver accepts the trip
        driver.acceptRide(trip);

        driver.completeRide(trip);

        PaymentMethod paymentMethod = new CreditCardPayment();
        rider.setPaymentMethod(trip, paymentMethod);

        // Process payment after the trip is complete
        trip.processPayment();
    }
}
