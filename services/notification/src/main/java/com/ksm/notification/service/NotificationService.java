package com.ksm.notification.service;

import com.ksm.notification.entity.Notification;
import com.ksm.notification.mapper.NotificationMapper;
import com.ksm.notification.repository.NotificationRepository;
import com.ksm.notification.request.NotificationReguest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;
    private final NotificationMapper notificationMapper;

    public String createNotification(NotificationReguest notificationReguest) {
        Notification notification = notificationMapper.toNotification(notificationReguest);
        return notificationRepository.save(notification).getId();
    }
}
