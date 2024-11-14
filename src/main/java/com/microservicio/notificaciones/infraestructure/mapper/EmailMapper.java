package com.microservicio.notificaciones.infraestructure.mapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

import com.microservicio.notificaciones.domain.dto.EmailDto;
import com.microservicio.notificaciones.infraestructure.entity.Notificaciones;


@Mapper(componentModel = "spring")
public interface EmailMapper {
    
    @Mappings({
        @Mapping(source = "encabezado", target= "header"),
        @Mapping(source = "contenido", target= "content"),
        @Mapping(source = "tipoNotificacion", target= "notificationType")
    })

    EmailDto toNotification (Notificaciones email);
    List<EmailDto> toNotifications (List<Notificaciones> email);

    @InheritInverseConfiguration
    @Mapping(target = "idNotificacion", ignore = true)
    @Mapping(target = "destinatario", ignore = true)
    @Mapping(target = "prioridad", ignore = true)
    @Mapping(target = "estado", ignore = true)
    @Mapping(target = "fechaCreacion", ignore = true)
    @Mapping(target = "fechaLectura", ignore = true)
    @Mapping(target = "fechaEntrega", ignore = true)
    @Mapping(target = "fechaActualizacion", ignore = true)
    @Mapping(target = "preferencias", ignore = true)

    Notificaciones toNotificacion (EmailDto email);
    List<Notificaciones> toNotificaciones (List<EmailDto> email);

}

