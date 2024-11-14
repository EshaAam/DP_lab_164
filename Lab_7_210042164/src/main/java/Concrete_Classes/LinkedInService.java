package Concrete_Classes;

import Interfaces.SocialMediaService;
import Models.Notification;

import java.util.ArrayList;
import java.util.List;

public class LinkedInService implements SocialMediaService {
    @Override
    public List<Notification> getNotifications() {
        List<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification("3", "New connection request on LinkedIn!", "LinkedIn", false));
        return notifications;
    }

    @Override
    public void markAsRead(String notificationId) {
        System.out.println("LinkedIn: Marked notification " + notificationId + " as read.");
    }

    @Override
    public void markAsUnread(String notificationId) {
        System.out.println("LinkedIn: Marked notification " + notificationId + " as unread.");
    }

    @Override
    public void deleteNotification(String notificationId) {
        System.out.println("LinkedIn: Deleted notification " + notificationId + ".");
    }
}
