package com.microservicio.notificaciones.infraestructure.crud_interface;

import org.springframework.data.repository.CrudRepository;

import com.microservicio.notificaciones.infraestructure.entity.Notificaciones;

import java.util.Optional;

public interface NotificacionesCrudRepository extends CrudRepository<Notificaciones, Long> {
    Optional<Notificaciones> findByIdNotificacion(Long idNotificacion);
}
