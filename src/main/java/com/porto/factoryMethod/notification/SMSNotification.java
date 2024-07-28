package com.porto.factoryMethod.notification;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Notificação por sms.");
    }
}
