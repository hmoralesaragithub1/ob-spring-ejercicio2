package com.anferdev;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void imprimirSaludo() {
        System.out.println("Imprimiendo saludo desde Notificacion Service...");
    }
}
