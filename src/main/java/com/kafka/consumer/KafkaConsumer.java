package com.kafka.consumer;

import com.kafka.model.KafkaModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	@KafkaListener(topics="KafkaJSON",groupId="myGroup")
	public void consume(KafkaModel kafkaModel) {
		System.out.println(kafkaModel.toString());
	}
}


