package com.alican.events.controller;

import com.alican.events.dto.DeliveryDto;
import com.alican.events.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public String createDelivery(@RequestBody DeliveryDto deliveryDto) {
        deliveryService.createDelivery(deliveryDto);
        return "Delivery created successfully";
    }
}
