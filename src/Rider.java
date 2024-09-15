public class Rider {
    private int id;
    private String name;
    private Location location;
    private double rating;
    private PreferredPaymentMethod preferredPaymentMethod;
    private NotificationPreference notificationPreference;

    // Constructor
    public Rider(int id, String name, PreferredPaymentMethod preferredPaymentMethod, NotificationPreference notificationPreference) {
        this.id = id;
        this.name = name;
//        this.location = location;
        this.preferredPaymentMethod = preferredPaymentMethod;
        this.notificationPreference = notificationPreference;
        this.rating = 0.0; // Default rating when the rider is new
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void updateRating(double newRating) {
        // Logic
        this.rating = (this.rating + newRating) / 2;
    }

    public PreferredPaymentMethod getPreferredPaymentMethod() {
        return preferredPaymentMethod;

    }

    public NotificationPreference getNotificationPreference() {
        return notificationPreference;
    }


}
