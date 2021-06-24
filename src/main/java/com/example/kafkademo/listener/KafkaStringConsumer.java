package com.example.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaStringConsumer {

    @KafkaListener(topics = "demo", groupId = "group-id")
    public void listen(String message) {
        System.out.println("Received Message: " + message + " in first consumer");
    }

    @KafkaListener(topics = "demo", groupId = "group-id1")
    public void otherListen(String message) {
        System.out.println("Received Message: " + message + " in second consumer");
    }
}
