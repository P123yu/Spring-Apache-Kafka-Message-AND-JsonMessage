package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopic {
    
    @Bean
    NewTopic myTopic() {
        return TopicBuilder.name("pkKafka").build();
    }

}


// here pkKafka is a topic name of kafka