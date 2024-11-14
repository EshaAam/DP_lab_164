package Facade_Pattern_Aggregator_class;
import Interfaces.SocialMediaService;
import Models.Notification;
import java.util.ArrayList;
import java.util.List;

public class NotificationAggregator {
    private List<SocialMediaService> services;

    public NotificationAggregator(List<SocialMediaService> services) {
        this.services = services;
    }

    public List<Notification> getAllNotifications() {
        List<Notification> allNotifications = new ArrayList<>();
        for (SocialMediaService service : services) {
            allNotifications.addAll(service.getNotifications());
        }
        return allNotifications;
    }

    public void markNotificationAsRead(String notificationId) {
        for (SocialMediaService service : services) {
            service.markAsRead(notificationId);
        }
    }

    public void markNotificationAsUnread(String notificationId) {
        for (SocialMediaService service : services) {
            service.markAsUnread(notificationId);
        }
    }

    public void deleteNotification(String notificationId) {
        for (SocialMediaService service : services) {
            service.deleteNotification(notificationId);
        }
    }
}
