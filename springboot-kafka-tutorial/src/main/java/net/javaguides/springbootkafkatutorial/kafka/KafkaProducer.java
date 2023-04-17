package net.javaguides.springbootkafkatutorial.kafka;

import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import static org.slf4j.Logger.*;


@Service
public class KafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    @Value("${spring.kafka.topic-json.name}")
    private String topicName;
    private KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message)
    {
        LOGGER.info(String.format("Message sent %s", message));
//        kafkaTemplate.send("javaguides" , message);
        kafkaTemplate.send(topicName, message);

    }
}
