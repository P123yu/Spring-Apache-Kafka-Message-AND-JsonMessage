package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {
	
	@Autowired
	private KafkaProducer kafkaProducer;
	
	@GetMapping("/get")
	public ResponseEntity<?>get(@RequestParam String message){
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("message sent");
	}

}
