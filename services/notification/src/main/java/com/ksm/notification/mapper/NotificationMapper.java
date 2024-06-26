package com.ksm.notification.mapper;

import com.ksm.notification.entity.Notification;
import com.ksm.notification.request.NotificationReguest;
import org.springframework.stereotype.Component;

@Component
public class NotificationMapper {
    public Notification toNotification(NotificationReguest notificationReguest) {
        if (notificationReguest == null) {
            return null;
        }
        return Notification.builder()
                .id(notificationReguest.id())
                .type(notificationReguest.type())
                .notificationDate(notificationReguest.notificationDate())
                .orderConfirmation(notificationReguest.orderConfirmation())
                .paymentConfirmation(notificationReguest.paymentConfirmation())
                .build();
    }
}
