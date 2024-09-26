public class CarpoolRide implements RideType {
    @Override
    public double calculateFare(double distance, double baseFare) {
        return baseFare + (distance * 2); // Carpool fare logic
    }
}
