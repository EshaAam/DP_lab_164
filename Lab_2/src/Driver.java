public class Driver {
    private int id;
    private String name;
    private String vehicleType;
    private String location;
    private double rating;
    private boolean available;

    // Constructor
    public Driver(int id, String name, String vehicleType, String location, double rating, boolean available) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = rating;
        this.available = available;
    }

    // Basic methods to get driver information
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return available;
    }

    // Accept the ride
    public void acceptRide(Trip trip) {
        if (available) {
            System.out.println(name + " has accepted the ride.");
            trip.startTrip();
            available = false;  // Mark the driver as unavailable during the trip
        } else {
            System.out.println(name + " is not available.");
        }
    }

    // Complete the ride
    public void completeRide(Trip trip) {
        trip.completeTrip();
        available = true;  // Make the driver available again
    }

    // Update the driver's rating
//    public void updateRating(double newRating) {
//        this.rating = (this.rating + newRating) / 2;  // Simple averaging of ratings
//        System.out.println("New rating for " + name + " is " + this.rating);
//    }
}
