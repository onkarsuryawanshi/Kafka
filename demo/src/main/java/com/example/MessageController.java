package com.example;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


///Building the queue to store the message
@RestController
@RequestMapping("api/v1/messages")
public class MessageController {
    private KafkaTemplate<String,String> kafkaTemplate;


    public MessageController(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate= kafkaTemplate;
    }


    //sending message through API using URI
    @PostMapping
    public  void publish(@RequestBody MessageRequest request){
        kafkaTemplate.send("amigoscode", request.message());
    }
}
