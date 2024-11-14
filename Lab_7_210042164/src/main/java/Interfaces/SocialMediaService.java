package Interfaces;
import Models.Notification;
import java.util.List;

public interface SocialMediaService {
    List<Notification> getNotifications();
    void markAsRead(String notificationId);
    void markAsUnread(String notificationId);
    void deleteNotification(String notificationId);
}
