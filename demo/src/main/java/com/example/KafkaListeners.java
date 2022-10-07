package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {



    @KafkaListener(
            topics = "amigoscode-1",
            groupId = "groupId"
    )
    void listener(String data){
//        System.out.println(data.toString());


        System.out.println("Listener reciver"+ data);

        //pick the data from here and put it into elastic search

    }
}
