package com.alican.events.service;

import com.alican.events.dto.DeliveryDto;
import com.alican.events.publisher.NotifyPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private NotifyPublisher notifyPublisher;

    public void createDelivery(DeliveryDto deliveryDto) {
        //TODO create delivery logic
        System.out.println("*************Delivery created*************");
        this.notify(deliveryDto);
    }

    public void notify(DeliveryDto deliveryDto) {
        System.out.println("*************notify method starts*************");
        notifyPublisher.publishEvent(deliveryDto);
        System.out.println("*************notify method ends*************");
    }

}
