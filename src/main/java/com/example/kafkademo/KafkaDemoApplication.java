package com.example.kafkademo;

import com.example.kafkademo.service.KafkaStringProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class KafkaDemoApplication implements CommandLineRunner {
    private final KafkaStringProducer producer;

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        for (int i = 0; i < 4; i++) {
            producer.sendMessage("DEMO");
        }
    }
}
