package com.anferdev;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    private NotificationService notification;

    public UserService(NotificationService notification) {
        this.notification = notification;
    }

    public NotificationService getNotification() {
        return notification;
    }


}
