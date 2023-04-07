package com.emonics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerStringController {
	public static final String TOPIC = "MyTopic";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/publish/{message}")
	public String publishMessage(@PathVariable("message") String message) {
		kafkaTemplate.send(TOPIC, message);
		return "Published Successfully";
	}

}
