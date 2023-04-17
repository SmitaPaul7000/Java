package net.javaguides.springbootkafkatutorial.controller;

import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import payload.User;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    // U can check by
    // C:\Users\Admin\Documents\kafka>.\bin\windows\kafka-console-consumer.bat --topic javaguides --from-beginning --bootstrap-server localhost:9092
    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}