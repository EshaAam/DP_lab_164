public enum RideType {
    CARPOOL("Carpool", 4, 5.0),
    LUXURY("Luxury", 1, 15.0),
    BIKE("Bike", 1, 3.0);

    private final String name;
    private final int maxCapacity;
    private final double baseFare;

    // Constructor
    RideType(String name, int maxCapacity, double baseFare) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.baseFare = baseFare;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getBaseFare() {
        return baseFare;
    }
}
