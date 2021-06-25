package com.example.kafkademo.dto;

import lombok.Data;

@Data
public class MessageRequest {
    private String message;
    private String topic;
}
