package net.javaguides.springbootkafkatutorial.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

//    @KafkaListener(topics="javaguides" , groupId = "myGroup")
//    public void consume(String message){
//
//        LOGGER.info(String.format("Message received -> %s", message));
//    }

    @KafkaListener(topics="${spring.kafka.topic-json.name}" , groupId = "myGroup")
    public void consume(String message){

        LOGGER.info(String.format("Message received -> %s", message));
    }


}
