package com.example.kafkademo.service;

import com.example.kafkademo.dto.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaStringProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(MessageRequest request){
        kafkaTemplate.send(request.getTopic(), request.getMessage());
    }
}
