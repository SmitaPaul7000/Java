package net.javaguides.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    @Value("${spring.kafka.topic-json.name}")
    private String topicName;
    @Bean
    public NewTopic javaguidesTopic(){
//        return TopicBuilder.name("javaguides")
//                .build();

        return TopicBuilder.name(topicName)
                .build();
    }
    @Bean
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                .build();

//        return TopicBuilder.name("topicName")
//                .build();
    }

}
