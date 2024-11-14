package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SocialMediaService> services = List.of(
                SocialMediaFactory.getService("Twitter"),
                SocialMediaFactory.getService("Facebook"),
                SocialMediaFactory.getService("LinkedIn")
        );

        NotificationAggregator aggregator = new NotificationAggregator(services);

        // Fetch all notifications
        List<Notification> notifications = aggregator.getAllNotifications();
        notifications.forEach(System.out::println);

        // Interact with notifications
        if (!notifications.isEmpty()) {
            String notificationId = notifications.get(0).getId();
            aggregator.markNotificationAsRead(notificationId);
            aggregator.deleteNotification(notificationId);
        }
    }
}
