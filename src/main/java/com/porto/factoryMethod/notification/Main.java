package com.porto.factoryMethod.notification;

public class Main {
    public static void main(String[] args) {
        NotificationCreator emailNotificationCreator = new EmailNotificationCreator();

        emailNotificationCreator.notifyUser();
    }
}
