package com.alican.events.publisher;

import com.alican.events.dto.DeliveryDto;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class NotifyPublisher {

    private final ApplicationEventPublisher publisher;

    NotifyPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent(final DeliveryDto deliveryDto) {
        publisher.publishEvent(new NotifySenderEvent(deliveryDto));
        publisher.publishEvent(new NotifyReceiverEvent(deliveryDto));
    }
}
