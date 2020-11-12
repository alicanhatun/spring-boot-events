package com.alican.events.publisher;

import org.springframework.context.ApplicationEvent;

public class NotifySenderEvent extends ApplicationEvent {

    public NotifySenderEvent(Object source) {
        super(source);
    }
}
