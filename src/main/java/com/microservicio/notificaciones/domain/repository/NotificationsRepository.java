package com.microservicio.notificaciones.domain.repository;

import com.microservicio.notificaciones.domain.dto.EmailDto;
import com.microservicio.notificaciones.domain.dto.NotificationResponse;
import com.microservicio.notificaciones.domain.dto.PushDto;

public interface NotificationsRepository {
    NotificationResponse sendEmailNotification(EmailDto emailDto);
    NotificationResponse sendPushNotification(PushDto pushDto);
}

