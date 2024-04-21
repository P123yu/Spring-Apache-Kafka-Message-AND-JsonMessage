package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	@KafkaListener(topics="pkKafka",groupId="myGroup")
	public void consume(String message) {
		System.out.println(message);
	}
}


