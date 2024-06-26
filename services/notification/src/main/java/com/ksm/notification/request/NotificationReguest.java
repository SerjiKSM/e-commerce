package com.ksm.notification.request;

import com.ksm.notification.enumeration.NotificationType;
import com.ksm.notification.record.OrderConfirmation;
import com.ksm.notification.record.PaymentConfirmation;

import java.time.LocalDateTime;

public record NotificationReguest(
        String id,
        NotificationType type,
        LocalDateTime notificationDate,
        OrderConfirmation orderConfirmation,
        PaymentConfirmation paymentConfirmation
) {
}
