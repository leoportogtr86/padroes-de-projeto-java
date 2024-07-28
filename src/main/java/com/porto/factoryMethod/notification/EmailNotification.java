package com.porto.factoryMethod.notification;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Notificação por e-mail");
    }
}
