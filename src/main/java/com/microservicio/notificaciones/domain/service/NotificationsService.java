package com.microservicio.notificaciones.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.notificaciones.domain.dto.EmailDto;
import com.microservicio.notificaciones.domain.dto.NotificationResponse;
import com.microservicio.notificaciones.domain.dto.PushDto;
import com.microservicio.notificaciones.infraestructure.repositories.NotificacionesRepository;

import jakarta.transaction.Transactional;

@Service
public class NotificationsService {

    @Autowired
    private NotificacionesRepository notificacionesRepository;

    @Transactional
    public NotificationResponse sendEmailNotification(EmailDto emailDto) {
        return notificacionesRepository.sendEmailNotification(emailDto);
    }

    @Transactional
    public NotificationResponse sendPushNotification(PushDto pushDto) {
        return notificacionesRepository.sendPushNotification(pushDto);
    }

}
