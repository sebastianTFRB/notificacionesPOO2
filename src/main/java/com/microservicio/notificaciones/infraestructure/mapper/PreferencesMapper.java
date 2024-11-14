package com.microservicio.notificaciones.infraestructure.mapper;

import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.microservicio.notificaciones.domain.dto.PreferencesDto;
import com.microservicio.notificaciones.infraestructure.entity.Preferencias;

@Mapper(componentModel= "spring")
public interface PreferencesMapper {
    @Mappings({
        @Mapping(source = "idPreferencias", target = "idPreferences"),
        @Mapping(source = "canalReceptor", target = "receiverChannel"),
        @Mapping(source = "idioma", target = "language"),
        @Mapping(source = "privacidad", target = "privacy"),
        @Mapping(source = "modoOscuro", target = "darkMode")
    })

    PreferencesDto toPreference(Preferencias preferencias);
    List<PreferencesDto> toPreferences(List<Preferencias> preferencias);

    @InheritInverseConfiguration
    @Mapping(target = "notificacion", ignore = true)
    Preferencias toPreferencia(PreferencesDto preferences);
    List<Preferencias> toPreferencias(List<PreferencesDto> preferences);

    
}
