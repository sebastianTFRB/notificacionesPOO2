package com.microservicio.notificaciones.infraestructure.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservicio.notificaciones.infraestructure.crud_interface.NotificacionesCrudRepository;
import com.microservicio.notificaciones.infraestructure.entity.Notificaciones;
import com.microservicio.notificaciones.infraestructure.mapper.EmailMapper;
import com.microservicio.notificaciones.infraestructure.mapper.PushMapper;
import com.microservicio.notificaciones.domain.dto.EmailDto;
import com.microservicio.notificaciones.domain.dto.NotificationResponse;
import com.microservicio.notificaciones.domain.dto.PushDto;
import com.microservicio.notificaciones.domain.repository.NotificationsRepository;

import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
@Repository
public class NotificacionesRepository implements NotificationsRepository {

    @Autowired
    private NotificacionesCrudRepository notificacionesCrudRepository;

    @Autowired
    private EmailMapper emailMapper;

    @Autowired
    private PushMapper pushMapper; // Asegúrate de inyectar PushMapper

    @Transactional
    public NotificationResponse sendEmailNotification(EmailDto emailDto) {
        Notificaciones notificacion = emailMapper.toNotificacion(emailDto);
        notificacion.setFechaCreacion(LocalDateTime.now());
        notificacion.setEstado(0);
        notificacionesCrudRepository.save(notificacion);
    
        notificacion.setEstado(1);
        notificacion.setFechaEntrega(LocalDateTime.now());
        notificacionesCrudRepository.save(notificacion);
    
        return new NotificationResponse("Correo enviado", 1, emailDto.getHeader(), emailDto.getContent(), emailDto.getNotificationType());
    }
    

    @Transactional
    public NotificationResponse sendPushNotification(PushDto pushDto) {
        Notificaciones notificacion = pushMapper.toPush(pushDto);
        notificacion.setFechaCreacion(LocalDateTime.now());
        notificacion.setEstado(0);
        notificacionesCrudRepository.save(notificacion);
    
        notificacion.setEstado(1);
        notificacion.setFechaEntrega(LocalDateTime.now());
        notificacionesCrudRepository.save(notificacion);
    
        return new NotificationResponse("Notificación enviada", 1, pushDto.getHeader(), pushDto.getContent(), pushDto.getNotificationType());
    }
    
}
