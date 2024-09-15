public class Driver {
    private int id;
    private String name;
    private String vehicleType;
    private Location location;
    private double rating;
    private boolean isAvailable;
    private Trip assignedTrip;

    // Constructor
    public Driver(int id, String name, String vehicleType, Location location) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.location = location;
        this.rating = 0.0; // Default rating when the driver is new
        this.isAvailable = true; // Initially available for rides
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Trip getAssignedTrip() {
        return assignedTrip;
    }

    // Method to accept a ride request
    public void acceptRide(Trip trip) {
        this.assignedTrip = trip;
        this.isAvailable = false;
        trip.setDriver(this); // Assign driver to the trip
        System.out.println("Driver " + this.name + " has accepted the ride.");
    }



    // Method to update driver's rating
    public void updateRating(double newRating) {
        this.rating = (this.rating + newRating) / 2; // Simple averaging
    }

    // Method to update driver's location
    public void updateLocation(Location newLocation) {
        this.location = newLocation;
    }
}
