package com.microservicio.notificaciones.domain.dto;

public class PreferencesDto {
    private Long idPreferences;
    private String receiverChannel;
    private String language;
    private Boolean privacy;
    private Boolean darkMode;

    public Long getIdPreferences() {
        return idPreferences;
    }

    public void setIdPreferences(Long idPreferences) {
        this.idPreferences = idPreferences;
    }

    public String getReceiverChannel() {
        return receiverChannel;
    }

    public void setReceiverChannel(String receiverChannel) {
        this.receiverChannel = receiverChannel;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }

    public Boolean getDarkMode() {
        return darkMode;
    }

    public void setDarkMode(Boolean darkMode) {
        this.darkMode = darkMode;
    }    
}

