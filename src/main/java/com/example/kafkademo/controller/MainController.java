package com.example.kafkademo.controller;

import com.example.kafkademo.dto.MessageRequest;
import com.example.kafkademo.service.KafkaStringProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class MainController {

    private final KafkaStringProducer producer;

    @PostMapping
    public String publishMessage(@RequestBody MessageRequest message) {
        producer.sendMessage(message);
        return "Sent";
    }
}
