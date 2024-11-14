package com.microservicio.notificaciones.domain.dto;

public class NotificationResponse {
    private String message;
    private int status;
    private String header;
    private String content;
    private String notificationType; // Cambia el nombre si lo prefieres

    public NotificationResponse(String message, int status, String header, String content, String notificationType) {
        this.message = message;
        this.status = status;
        this.header = header;
        this.content = content;
        this.notificationType = notificationType;
    }

    // Getters y Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
}

