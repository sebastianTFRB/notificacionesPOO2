package com.microservicio.notificaciones.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.notificaciones.domain.dto.EmailDto;
import com.microservicio.notificaciones.domain.dto.NotificationResponse;
import com.microservicio.notificaciones.domain.dto.PushDto;
import com.microservicio.notificaciones.domain.service.NotificationsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/notificaciones")
public class NotificationsController {
    
    @Autowired
    private NotificationsService notificationService;

    @PostMapping("/email")
    public ResponseEntity<NotificationResponse> enviarNotificacionEmail(@RequestBody EmailDto emailDto) {
        NotificationResponse respuesta = notificationService.sendEmailNotification(emailDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @PostMapping("/push")
    public ResponseEntity<NotificationResponse> enviarNotificacionPush(@RequestBody PushDto pushDto) {
        NotificationResponse respuesta = notificationService.sendPushNotification(pushDto);
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
    

    
}
