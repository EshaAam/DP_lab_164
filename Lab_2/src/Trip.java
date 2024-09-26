public class Trip {
    private int id;
    private Rider rider;
    private Driver driver;
    private String pickupLocation;
    private String dropOffLocation;
    private String rideType;
    private double fare;
    private PaymentMethod paymentMethod;
    private boolean isActive;  // Indicates if the trip is currently active

    // Constructor
    public Trip(int id, Rider rider, Driver driver, String pickupLocation, String dropOffLocation, String rideType, double fare) {
        this.id = id;
        this.rider = rider;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
        this.fare = fare;
        this.isActive = true;  // Trip is active
    }


    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Simulate trip start
    public void startTrip() {
        if (isActive) {
            System.out.println("Trip started from " + pickupLocation + " to " + dropOffLocation);
        } else {
            System.out.println("Trip has already ended.");
        }
    }


    public void completeTrip() {
        if (isActive) {
            System.out.println("Trip completed from " + pickupLocation + " to " + dropOffLocation);
            this.isActive = false;  // Set active status to false once the trip is complete
        } else {
            System.out.println("Trip has already been completed.");
        }
    }


    public void processPayment() {
        if (paymentMethod != null) {
            if (!isActive) {
                paymentMethod.processPayment(fare);
            } else {
                System.out.println("Cannot process payment until the trip is completed.");
            }
        } else {
            System.out.println("No payment method selected.");
        }
    }

    // Method to check if the trip is active
    public boolean isActive() {
        return isActive;
    }
}
