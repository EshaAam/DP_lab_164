public class Trip{

    private Driver driver;
    private Object tripStatus;
    private int id;
    private Rider rider;
    private Location pickupLocation;
    private Location dropOffLocation;
    private RideType rideType;
    private double fare;
    private double distance; // Distance in kilometers
//    private TripStatus status;
//    private LocalDateTime startTime;
//    private LocalDateTime endTime;

    public Trip(Rider rider, Location pickupLocation, Location dropOffLocation, RideType rideType) {
        this.rider = rider;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.rideType = rideType;
//        this.distance = pickupLocation.calculateDistance(dropOffLocation); // Assume Location has distance calculation
//        this.status = TripStatus.REQUESTED; // Default status when trip is created
        this.fare = calculateFare(); // Calculate fare based on distance and ride type
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        
    }

//    public void startTrip() {
//        this.tripStatus = TripStatus.IN_PROGRESS;
//    }
//
//    public void completeTrip() {
//        this.tripStatus = TripStatus.COMPLETED;
//    }

    private double calculateFare() {
        double baseFare;
        switch (rideType) {
            case CARPOOL:
                baseFare = 5.0;
                break;
            case LUXURY:
                baseFare = 15.0;
                break;
            case BIKE:
                baseFare = 3.0;
                break;
            default:
                baseFare = 10.0;
        }
        return baseFare + (distance * 1.5);
    }
}
