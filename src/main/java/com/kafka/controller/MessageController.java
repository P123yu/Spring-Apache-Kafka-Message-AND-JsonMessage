package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.model.KafkaModel;
import com.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@PostMapping("/send")
	public ResponseEntity<?>get(@RequestBody KafkaModel kafkaModel){
		kafkaProducer.sendMessage(kafkaModel);
		return ResponseEntity.ok("json message sent to kafka topic");
	}

}
