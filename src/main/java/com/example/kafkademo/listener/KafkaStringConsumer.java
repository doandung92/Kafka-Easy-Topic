package com.example.kafkademo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaStringConsumer {

    @KafkaListener(topics = "demo", groupId = "group-id")
    public void listen(@Payload String message,
                       @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                       @Header(KafkaHeaders.GROUP_ID) String groupId) {
        System.out.println("Received Message: " + message + " from partition: " + partition + " of groupId: " + groupId);
    }

    @KafkaListener(topics = "demo", groupId = "group-id1")
    public void otherListen(@Payload String message,
                            @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition,
                            @Header(KafkaHeaders.GROUP_ID) String groupId) {
        System.out.println("Received Message: " + message + " from partition: " + partition + " of groupId: " + groupId);
    }
}
