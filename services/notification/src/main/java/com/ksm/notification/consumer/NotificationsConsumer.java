package com.ksm.notification.consumer;

import com.ksm.notification.record.OrderConfirmation;
import com.ksm.notification.record.PaymentConfirmation;
import com.ksm.notification.request.NotificationReguest;
import com.ksm.notification.service.EmailService;
import com.ksm.notification.service.NotificationService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.ksm.notification.enumeration.NotificationType.ORDER_CONFIRMATION;
import static com.ksm.notification.enumeration.NotificationType.PAYMENT_CONFIRMATION;
import static java.lang.String.format;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationsConsumer {

    private final NotificationService notificationService;
    private final EmailService emailService;

    @KafkaListener(topics = "payment-topic")
    public void consumePaymentSuccessNotifications(PaymentConfirmation paymentConfirmation) throws MessagingException {
        log.info(format("Consuming the message from payment-topic Topic:: %s", paymentConfirmation));

        NotificationReguest notificationReguest = new NotificationReguest(
                null,
                PAYMENT_CONFIRMATION,
                LocalDateTime.now(),
                null,
                paymentConfirmation
        );
        notificationService.createNotification(notificationReguest);

        var customerName = paymentConfirmation.customerFirstname() + " " + paymentConfirmation.customerLastname();
        emailService.sendPaymentSuccessEmail(
                paymentConfirmation.customerEmail(),
                customerName,
                paymentConfirmation.amount(),
                paymentConfirmation.orderReference()
        );
    }

    @KafkaListener(topics = "order-topic")
    public void consumeOrderConfirmationNotifications(OrderConfirmation orderConfirmation) throws MessagingException {
        log.info(format("Consuming the message from order-topic Topic:: %s", orderConfirmation));

        NotificationReguest notificationReguest = new NotificationReguest(
                null,
                ORDER_CONFIRMATION,
                LocalDateTime.now(),
                orderConfirmation,
                null
        );
        notificationService.createNotification(notificationReguest);
        var customerName = orderConfirmation.customer().firstname() + " " + orderConfirmation.customer().lastname();
        emailService.sendOrderConfirmationEmail(
                orderConfirmation.customer().email(),
                customerName,
                orderConfirmation.totalAmount(),
                orderConfirmation.orderReference(),
                orderConfirmation.products()
        );
    }
}
