package com.lost.found.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = "found-new-item",groupId = "my-group-id")
    public void listen(String message){
        System.out.println("Sent->"+message);
    }
}