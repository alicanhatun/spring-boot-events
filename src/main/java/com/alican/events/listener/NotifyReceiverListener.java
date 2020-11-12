package com.alican.events.listener;

import com.alican.events.publisher.NotifyReceiverEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class NotifyReceiverListener {

    @Async
    @EventListener
    public void notifyReceiver(NotifyReceiverEvent notifyReceiverEvent) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("*************notify receiver*************");
        System.out.println(notifyReceiverEvent.getSource().toString());
    }
}
