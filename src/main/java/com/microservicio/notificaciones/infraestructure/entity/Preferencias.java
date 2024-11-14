package com.microservicio.notificaciones.infraestructure.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "preferencia_usuarios")
public class Preferencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preferencias")
    private Long idPreferencias;

    @Column(name = "canal_receptor")
    private String canalReceptor;

    private String idioma;

    private Boolean privacidad;

    @Column(name = "modo_oscuro")
    private Boolean modoOscuro;

    // Relación ManyToOne con Notificaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_notificacion", referencedColumnName = "id_notificacion")
    private Notificaciones notificacion;

    // Getters y Setters

    public Long getIdPreferencias() {
        return idPreferencias;
    }

    public void setIdPreferencias(Long idPreferencias) {
        this.idPreferencias = idPreferencias;
    }

    public String getCanalReceptor() {
        return canalReceptor;
    }

    public void setCanalReceptor(String canalReceptor) {
        this.canalReceptor = canalReceptor;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Boolean getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(Boolean privacidad) {
        this.privacidad = privacidad;
    }

    public Boolean getModoOscuro() {
        return modoOscuro;
    }

    public void setModoOscuro(Boolean modoOscuro) {
        this.modoOscuro = modoOscuro;
    }

    public Notificaciones getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(Notificaciones notificacion) {
        this.notificacion = notificacion;
    }
}
