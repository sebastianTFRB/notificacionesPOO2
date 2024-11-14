package com.microservicio.notificaciones.infraestructure.crud_interface;

import org.springframework.data.repository.CrudRepository;
import com.microservicio.notificaciones.infraestructure.entity.Preferencias;
import java.util.Optional;

public interface PreferenciasCrudRepository extends CrudRepository<Preferencias, Long> {
    Optional<Preferencias> findByIdPreferencias(Long idPreferencias); 
}
    