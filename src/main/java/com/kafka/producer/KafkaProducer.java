



package com.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.model.KafkaModel;

@Service
public class KafkaProducer {
	
	
	private KafkaTemplate<String, KafkaModel> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, KafkaModel> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}


	
	public void sendMessage(KafkaModel data) {
		System.out.println(data);	
		Message<KafkaModel> message=MessageBuilder.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC, "KafkaJSON").build();
		kafkaTemplate.send(message);
	}

}







//package com.kafka.producer;
//
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaProducer {
//	
//	
//	private KafkaTemplate<String,String>kafkaTemplate;
//	
//	public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//	}
//
//
//	
//	public void sendMessage(String message) {
//		System.out.println(message);	
//		kafkaTemplate.send("pkKafka",message);
//	}
//
//}
//
//
//


