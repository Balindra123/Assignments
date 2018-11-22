package com.wap;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.time.Instant;

public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println(Instant.now() + ": Session " + httpSessionEvent.getSession().getId() + " created.");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println(Instant.now() + ": Session " + httpSessionEvent.getSession().getId() + " destroyed.");
    }
}
