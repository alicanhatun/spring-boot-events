package com.alican.events.listener;

import com.alican.events.publisher.NotifySenderEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotifySenderListener {

    @Async
    @EventListener
    public void notifySender(NotifySenderEvent notifySenderEvent) {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*************notify sender*************");
        System.out.println(notifySenderEvent.getSource().toString());
    }
}
