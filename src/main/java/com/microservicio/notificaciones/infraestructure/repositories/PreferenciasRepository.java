package com.microservicio.notificaciones.infraestructure.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.microservicio.notificaciones.infraestructure.crud_interface.PreferenciasCrudRepository;
import com.microservicio.notificaciones.infraestructure.entity.Preferencias;

import java.util.List;
import java.util.Optional;

@Repository
public class PreferenciasRepository {

    @Autowired
    private PreferenciasCrudRepository preferenciasCrudRepository;

    // Método para obtener una preferencia por su ID
    public Optional<Preferencias> findByIdPreferencias(Long idPreferencias) {
        return preferenciasCrudRepository.findByIdPreferencias(idPreferencias);
    }

    // Método para obtener todas las preferencias
    public List<Preferencias> findAll() {
        return (List<Preferencias>) preferenciasCrudRepository.findAll();
    }

    // // Método para obtener preferencias asociadas a una notificación
    // public List<Preferencias> findByNotificacionId(Long notificacionId) {
    //     return preferenciasCrudRepository.findByNotificacionId(notificacionId);
    // }

    // Método para guardar una nueva preferencia
    public Preferencias save(Preferencias preferencias) {
        return preferenciasCrudRepository.save(preferencias);
    }

    // Método para eliminar una preferencia por su ID
    public void deleteById(Long idPreferencias) {
        preferenciasCrudRepository.deleteById(idPreferencias);
    }
}
