package com.alican.events.publisher;

import org.springframework.context.ApplicationEvent;

public class NotifyReceiverEvent extends ApplicationEvent {

    public NotifyReceiverEvent(Object source) {
        super(source);
    }
}
