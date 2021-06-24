package com.example.kafkademo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaStringProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        String demoTopic = "demo";

        kafkaTemplate.send(demoTopic, message);
    }
}
