package com.porto.singleton;

public class Logger {
    private Logger instance;

    private Logger() {
    }

    public Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println(msg);
    }
}
